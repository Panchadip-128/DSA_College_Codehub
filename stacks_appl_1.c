#include <stdio.h>
#include <stdlib.h>

#define MAX 100

int i,j;
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

void push(Stack *s, int item) {
if (s->top < MAX - 1) {
    s->items[++(s->top)] = item;
} else {
    printf("Stack is full\n");
}
}

int pop(Stack *s) {
    if (!isEmpty(s)) {
        return s->items[(s->top)--];
    } else {
        printf("Stack is empty\n");
        return -1;
    }
}

void insertAtBottom(Stack *s, int item) {
if (isEmpty(s)) {
    push(s, item);
} else {
    int temp = pop(s);
    insertAtBottom(s, item);
    push(s, temp);
}
}

void reverseStack(Stack *s) {
    if (!isEmpty(s)) {
        int temp = pop(s);
        reverseStack(s);
        insertAtBottom(s, temp);
    }
}

void printStack(Stack *s) {
    for (i = 0; i <= s->top; i++) {
        printf("%d ", s->items[i]);
    }
    printf("\n");
}

int main() {
Stack s;
initStack(&s);

push(&s, 1);
push(&s, 2);
push(&s, 3);
push(&s, 4);

printf("Original Stack: ");
printStack(&s);

reverseStack(&s);

printf("Reversed Stack: ");
printStack(&s);

return 0;
}
