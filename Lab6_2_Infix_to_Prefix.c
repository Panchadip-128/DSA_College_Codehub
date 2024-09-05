#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

#define MAX 100


typedef struct {
int top;
char items[MAX];
} Stack;


void initStack(Stack *s) {
    s->top = -1;
}


int isEmpty(Stack *s) {
    return s->top == -1;
}


void push(Stack *s, char value) {
if (s->top == MAX - 1) {
printf("Stack overflow\n");
return;
}
s->items[++(s->top)] = value;
}


char pop(Stack *s) {
if (isEmpty(s)) {
    printf("Stack underflow\n");
    exit(1);
}
return s->items[(s->top)--];
}


int precedence(char op) {
switch (op) {
case '+':
case '-':
    return 1;
case '*':
case '/':
    return 2;
case '^':
    return 3;
default:
    return 0;
    }
}

int isOperator(char ch) {
    return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
}
int i;

void reverse(char *exp) {
int length = strlen(exp);
for (i = 0; i < length / 2; i++) {
    char temp = exp[i];
    exp[i] = exp[length - i - 1];
    exp[length - i - 1] = temp;
}
}


void infixToPostfix(char *infix, char *postfix) {
    Stack s;
    initStack(&s);
    int k = 0;

for (i = 0; infix[i]; i++) {
    if (isdigit(infix[i]) || isalpha(infix[i])) {
    postfix[k++] = infix[i];
} else if (infix[i] == '(') {
    push(&s, infix[i]);
} else if (infix[i] == ')') {
    while (!isEmpty(&s) && s.items[s.top] != '(') {
        postfix[k++] = pop(&s);
    }
        pop(&s);
} else if (isOperator(infix[i])) {
    while (!isEmpty(&s) && precedence(s.items[s.top]) >= precedence(infix[i])) {
        postfix[k++] = pop(&s);
    }
    push(&s, infix[i]);
}
}

while (!isEmpty(&s)) {
    postfix[k++] = pop(&s);
}

postfix[k] = '\0';
}

void infixToPrefix(char *infix, char *prefix) {
    reverse(infix);

for (i = 0; infix[i]; i++) {
    if (infix[i] == '(') {
        infix[i] = ')';
    } else if (infix[i] == ')') {
        infix[i] = '(';
    }
}

char postfix[MAX];
infixToPostfix(infix, postfix);

reverse(postfix);
strcpy(prefix, postfix);
}

int main() {
char infix[MAX] = "(A-B/C)*(A/K-L)";
char prefix[MAX];

infixToPrefix(infix, prefix);

printf("Infix Expression: %s\n", infix);
printf("Prefix Expression: %s\n", prefix);

return 0;
}
