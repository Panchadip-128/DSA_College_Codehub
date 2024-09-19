#include <stdio.h>
#include <stdlib.h>

// Node structure
typedef struct Node {
    int data;
    struct Node* next;
} Node;

// Priority Queue structure
typedef struct PriorityQueue {
    Node* head;
} PriorityQueue;

// Function to create a new node
Node* newNode(int data) {
    Node* temp = (Node*)malloc(sizeof(Node));
    temp->data = data;
    temp->next = NULL;
    return temp;
}

// Function to initialize the priority queue
void initQueue(PriorityQueue* pq) {
    pq->head = NULL;
}

// Function to insert an element into the priority queue
void pqinsert(PriorityQueue* pq, int data) {
    Node* temp = newNode(data);
    if (pq->head == NULL || pq->head->data > data) {
        temp->next = pq->head;
        pq->head = temp;
    } else {
        Node* current = pq->head;
        while (current->next != NULL && current->next->data <= data) {
            current = current->next;
        }
        temp->next = current->next;
        current->next = temp;
    }
}

// Function to delete the minimum element from the priority queue
int pqmindelete(PriorityQueue* pq) {
    if (pq->head == NULL) {
        printf("Priority Queue is empty\n");
        return -1;
    }
    Node* temp = pq->head;
    pq->head = pq->head->next;
    int minData = temp->data;
    free(temp);
    return minData;
}

// Function to display the priority queue
void displayQueue(PriorityQueue* pq) {
    Node* current = pq->head;
    while (current != NULL) {
        printf("%d ", current->data);
        current = current->next;
    }
    printf("\n");
}

int main() {
    PriorityQueue pq;
    initQueue(&pq);

    pqinsert(&pq, 30);
    pqinsert(&pq, 10);
    pqinsert(&pq, 20);
    pqinsert(&pq, 40);

    printf("Priority Queue: ");
    displayQueue(&pq);

    printf("Deleted min element: %d\n", pqmindelete(&pq));
    printf("Priority Queue after deletion: ");
    displayQueue(&pq);

    return 0;
}
