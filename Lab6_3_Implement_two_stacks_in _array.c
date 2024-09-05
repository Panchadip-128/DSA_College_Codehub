#include <stdio.h>
#include <stdlib.h>

#define MAX 100

typedef struct {
    int arr[MAX];
    int top1;
    int top2;
} TwoStacks;


void initTwoStacks(TwoStacks *ts) {
ts->top1 = -1;
ts->top2 = MAX;
}


void push1(TwoStacks *ts, int value) {
if (ts->top1 < ts->top2 - 1) {
    ts->arr[++(ts->top1)] = value;
} else {
    printf("Stack Overflow\n");
}
}


void push2(TwoStacks *ts, int value) {
if (ts->top1 < ts->top2 - 1) {
    ts->arr[--(ts->top2)] = value;
} else {
    printf("Stack Overflow\n");
}
}


int pop1(TwoStacks *ts) {
if (ts->top1 >= 0) {
    return ts->arr[(ts->top1)--];
} else {
    printf("Stack Underflow\n");
    exit(1);
}
}


int pop2(TwoStacks *ts) {
if (ts->top2 < MAX) {
    return ts->arr[(ts->top2)++];
} else {
    printf("Stack Underflow\n");
    exit(1);
}
}

int i;
void displayStack1(TwoStacks *ts) {
printf("Stack 1: ");
for (i = 0; i <= ts->top1; i++) {
    printf("%d ", ts->arr[i]);
}
printf("\n");
}


void displayStack2(TwoStacks *ts) {
printf("Stack 2: ");
for (i = MAX - 1; i >= ts->top2; i--) {
    printf("%d ", ts->arr[i]);
}
printf("\n");
}

int main() {
TwoStacks ts;
initTwoStacks(&ts);

push1(&ts, 5);
push1(&ts, 10);
push2(&ts, 15);
push2(&ts, 20);

displayStack1(&ts);
displayStack2(&ts);

printf("Popped from stack 1: %d\n", pop1(&ts));
printf("Popped from stack 2: %d\n", pop2(&ts));

displayStack1(&ts);
displayStack2(&ts);

return 0;
}
