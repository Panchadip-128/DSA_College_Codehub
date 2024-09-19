#include <stdio.h>
#include <stdlib.h>

#define MAX 100

typedef struct {
    int data[MAX];
    int front, rear;
} Queue;

// Function to initialize the queue
void initQueue(Queue* q) {
    q->front = -1;
    q->rear = -1;
}

// Function to check if the queue is empty
int empty(Queue* q) {
    return (q->front == -1);
}

// Function to check if the queue is full
int isFull(Queue* q) {
    return ((q->rear + 1) % MAX == q->front);
}

// Function to add an item to the rear of the queue
void enqueue(Queue* q, int x) {
    if (isFull(q)) {
        printf("Queue is full!\n");
        return;
    }
    if (empty(q)) {
        q->front = 0;
        q->rear = 0;
    } else {
        q->rear = (q->rear + 1) % MAX;
    }
    q->data[q->rear] = x;
}

// Function to remove an item from the front of the queue
int dequeue(Queue* q) {
    if (empty(q)) {
        printf("Queue is empty!\n");
        return -1;
    }
    int x = q->data[q->front];
    if (q->front == q->rear) {
        q->front = -1;
        q->rear = -1;
    } else {
        q->front = (q->front + 1) % MAX;
    }
    return x;
}

// Function to reverse the queue using recursion
void reverseQueue(Queue* q) {
    if (empty(q)) {
        return;
    }
    int x = dequeue(q);
    reverseQueue(q);
    enqueue(q, x);
}

// Function to display the queue
void displayQueue(Queue* q) {
    if (empty(q)) {
        printf("Queue is empty!\n");
        return;
    }
    int i = q->front;
    while (1) {
        printf("%d ", q->data[i]);
        if (i == q->rear) break;
        i = (i + 1) % MAX;
    }
    printf("\n");
}

int main() {
    Queue q;
    initQueue(&q);

    enqueue(&q, 10);
    enqueue(&q, 20);
    enqueue(&q, 30);
    enqueue(&q, 40);

    printf("Original Queue: ");
    displayQueue(&q);

    reverseQueue(&q);

    printf("Reversed Queue: ");
    displayQueue(&q);

    return 0;
}
