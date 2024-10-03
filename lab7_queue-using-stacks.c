#include <stdio.h>
#include <stdlib.h>
#define MAX 100 // Maximum size of the stack

// Stack structure
typedef struct {
    int top;
    int items[MAX];
} Stack;

// Function to initialize the stack
void initStack(Stack *s) {
    s->top = -1;
}

// Function to check if the stack is empty
int isEmpty(Stack *s) {
    return s->top == -1;
}

// Function to check if the stack is full
int isFull(Stack *s) {
    return s->top == MAX - 1;
}

// Function to push an element onto the stack
void push(Stack *s, int value) {
    if (isFull(s)) {
        printf("Stack Overflow\n");
    } else {
        s->items[++(s->top)] = value;
    }
}

// Function to pop an element from the stack
int pop(Stack *s) {
    if (isEmpty(s)) {
        printf("Stack Underflow\n");
        return -1; // Indicate an error
    } else {
        return s->items[(s->top)--];
    }
}

// Queue structure using two stacks
typedef struct {
    Stack stack1; // Input stack
    Stack stack2; // Output stack
} Queue;

// Function to initialize the queue
void initQueue(Queue *q) {
    initStack(&q->stack1);
    initStack(&q->stack2);
}

// Function to add an element to the queue
void enqueue(Queue *q, int value) {
    push(&q->stack1, value); // Always push to stack1
    printf("Enqueued: %d\n", value);
}

// Function to remove an element from the queue
int dequeue(Queue *q) {
    if (isEmpty(&q->stack2)) { // If stack2 is empty, transfer all elements from stack1 to stack2
        while (!isEmpty(&q->stack1)) {
            int temp = pop(&q->stack1);
            push(&q->stack2, temp);
        }
    }
    if (isEmpty(&q->stack2)) { // If stack2 is still empty, queue is empty
        printf("Queue is Empty! Cannot dequeue.\n");
        return -1;
    }
    int dequeuedValue = pop(&q->stack2);
    printf("Dequeued: %d\n", dequeuedValue);
    return dequeuedValue;
}

// Function to display the current elements in the queue
void displayQueue(Queue *q) {
    // To display the queue correctly from front to rear, we need to display elements in stack2 first
    // then display elements in stack1 in reverse order.
    printf("Queue elements: ");

    // Display elements in stack2 (front part of the queue)
    for (int i = q->stack2.top; i >= 0; i--) {
        printf("%d ", q->stack2.items[i]);
    }

    // Display elements in stack1 (rear part of the queue) in reverse order
    for (int i = q->stack1.top; i >= 0; i--) {
        printf("%d ", q->stack1.items[i]);
    }

    printf("\n");
}

// Main function to demonstrate queue operations using two stacks
int main() {
    Queue q;
    initQueue(&q);

    enqueue(&q, 10);
    enqueue(&q, 20);
    enqueue(&q, 30);
    displayQueue(&q);  // Expected: 10 20 30

    dequeue(&q);
    displayQueue(&q);  // Expected: 20 30

    enqueue(&q, 40);
    displayQueue(&q);  // Expected: 20 30 40

    dequeue(&q);
    displayQueue(&q);  // Expected: 30 40

    dequeue(&q);
    displayQueue(&q);  // Expected: 40

    return 0;
}
