#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX 100

typedef struct {
    char data[MAX];
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


void insertRear(Deque* dq, char ch) {
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
    dq->data[dq->rear] = ch;
}


char deleteFront(Deque* dq) {
    if (isEmpty(dq)) {
        printf("Deque is empty!\n");
        return '\0';
    }
    char ch = dq->data[dq->front];
    if (dq->front == dq->rear) {
        dq->front = -1;
        dq->rear = -1;
    } else {
        dq->front = (dq->front + 1) % MAX;
    }
    return ch;
}


char deleteRear(Deque* dq) {
    if (isEmpty(dq)) {
        printf("Deque is empty!\n");
        return '\0';
    }
    char ch = dq->data[dq->rear];
    if (dq->front == dq->rear) {
        dq->front = -1;
        dq->rear = -1;
    } else {
        dq->rear = (dq->rear - 1 + MAX) % MAX;
    }
    return ch;
}
int i=0;

int isPalindrome(char* str) {
    Deque dq;
    initDeque(&dq);


    for (i = 0; i < strlen(str); i++) {
        insertRear(&dq, str[i]);
    }


    while (!isEmpty(&dq)) {
        char frontChar = deleteFront(&dq);
        if (!isEmpty(&dq)) {
            char rearChar = deleteRear(&dq);
            if (frontChar != rearChar) {
                return 0;
            }
        }
    }
    return 1;
}

int main() {
    char str[MAX];
    printf("Enter a string: ");
    scanf("%s", str);

    if (isPalindrome(str)) {
        printf("The string is a palindrome.\n");
    } else {
        printf("The string is not a palindrome.\n");
    }

    return 0;
}
