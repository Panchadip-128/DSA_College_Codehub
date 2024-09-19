#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX 100

typedef struct {
    char data[MAX][100];
    int front, rear;
} Deque;


void initDeque(Deque* dq) {
    dq->front = -1;
    dq->rear = -1;
}


int isEmpty(Deque* dq) {
    return (dq->front == -1);
}


int isFull(Deque* dq) {
    return ((dq->rear + 1) % MAX == dq->front);
}


void insertRear(Deque* dq, char* str) {
    if (isFull(dq)) {
        printf("Deque is full!\n");
        return;
    }
    if (isEmpty(dq)) {
        dq->front = 0;
        dq->rear = 0;
    } else {
        dq->rear = (dq->rear + 1) % MAX;
    }
    strcpy(dq->data[dq->rear], str);
}


void insertFront(Deque* dq, char* str) {
    if (isFull(dq)) {
        printf("Deque is full!\n");
        return;
    }
    if (isEmpty(dq)) {
        dq->front = 0;
        dq->rear = 0;
    } else {
        dq->front = (dq->front - 1 + MAX) % MAX;
    }
    strcpy(dq->data[dq->front], str);
}


void deleteFront(Deque* dq) {
    if (isEmpty(dq)) {
        printf("Deque is empty!\n");
        return;
    }
    printf("Deleted: %s\n", dq->data[dq->front]);
    if (dq->front == dq->rear) {
        dq->front = -1;
        dq->rear = -1;
    } else {
        dq->front = (dq->front + 1) % MAX;
    }
}


void displayDeque(Deque* dq) {
    if (isEmpty(dq)) {
        printf("Deque is empty!\n");
        return;
    }
    int i = dq->front;
    while (1) {
        printf("%s ", dq->data[i]);
        if (i == dq->rear) break;
        i = (i + 1) % MAX;
    }
    printf("\n");
}

int main() {
    Deque dq;
    initDeque(&dq);

    insertRear(&dq, "Hello");
    insertRear(&dq, "World");
    insertFront(&dq, "Start");
    displayDeque(&dq);

    deleteFront(&dq);
    displayDeque(&dq);

    insertRear(&dq, "Hello-2nd time");
    displayDeque(&dq);

    return 0;
}
