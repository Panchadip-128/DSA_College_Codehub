#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>

#define MAX 100


typedef struct {
int top;
int items[MAX];
} Stack;


void initStack(Stack *s) {
    s->top = -1;
}


int isEmpty(Stack *s) {
return s->top == -1;
}


void push(Stack *s, int value) {
if (s->top == MAX - 1) {
    printf("Stack overflow\n");
    return;
}
s->items[++(s->top)] = value;
}


int pop(Stack *s) {
    if (isEmpty(s)) {
        printf("Stack underflow\n");
        exit(1);
    }
return s->items[(s->top)--];
}


int evaluatePrefix(char* expression) {
Stack s;
initStack(&s);
int i,j;

int length = strlen(expression);
for (i = length - 1; i >= 0; i--) {

    if (isdigit(expression[i])) {
        push(&s, expression[i] - '0');
    } else {

int operand1 = pop(&s);
int operand2 = pop(&s);


switch (expression[i]) {
case '+':
push(&s, operand1 + operand2);
break;
case '-':
push(&s, operand1 - operand2);
break;
case '*':
push(&s, operand1 * operand2);
break;
case '/':
push(&s, operand1 / operand2);
break;
            }
        }
    }


 return pop(&s);
}

int main() {
    char expression[] = "-+7*45+20";
    printf("The result of the prefix expression %s is %d\n", expression, evaluatePrefix(expression));
    return 0;
}
