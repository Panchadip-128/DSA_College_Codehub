#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

#define MAX 100


typedef struct {
int top;
char items[MAX][MAX];
} Stack;


void initStack(Stack *s) {
s->top = -1;
}


int isEmpty(Stack *s) {
return s->top == -1;
}


void push(Stack *s, char *value) {
if (s->top == MAX - 1) {
printf("Stack overflow\n");
return;
}
strcpy(s->items[++(s->top)], value);
}


char* pop(Stack *s) {
if (isEmpty(s)) {
    printf("Stack underflow\n");
    exit(1);
}
return s->items[(s->top)--];
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


int isOperator(char ch) {
return ch == '+' || ch == '-' || ch == '*' || ch == '/';
}


void prefixToPostfix(char *prefix, char *postfix) {
Stack s;
initStack(&s);


reverse(prefix);

for (i = 0; prefix[i]; i++) {

if (isalnum(prefix[i])) {
    char operand[2] = {prefix[i], '\0'};
    push(&s, operand);
} else if (isOperator(prefix[i])) {

char operand1[MAX], operand2[MAX];
strcpy(operand1, pop(&s));
strcpy(operand2, pop(&s));


char newExpr[MAX] = "";
strcat(newExpr, operand1);
strcat(newExpr, operand2);
strncat(newExpr, &prefix[i], 1);


push(&s, newExpr);
}
}


strcpy(postfix, pop(&s));
}

int main() {
char prefix[MAX] = "*-A/BC-/AKL";
char postfix[MAX];

prefixToPostfix(prefix, postfix);

printf("Prefix Expression: %s\n", prefix);
printf("Postfix Expression: %s\n", postfix);

return 0;
}
