#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX 5 // Maximum size of the circular queue
// Structure to represent a circular queue
typedef struct {
 char items[MAX][50]; // Array to store strings
 int front, rear; // Indices for front and rear
} CircularQueue;
// Function to initialize the circular queue
void initializeQueue(CircularQueue *q) {
 q->front = -1;
 q->rear = -1;
}
// Function to check if the queue is full
int isFull(CircularQueue *q) {
 return ((q->rear + 1) % MAX == q->front);
}
// Function to check if the queue is empty
int isEmpty(CircularQueue *q) {
 return (q->front == -1);
}
// Function to insert a string into the circular queue
void insertcq(CircularQueue *q, char *str) {
 if (isFull(q)) {
 printf("Queue is Full! Cannot insert '%s'.\n", str);
 return;
 }
 // Calculate the new rear position
 q->rear = (q->rear + 1) % MAX;
 strcpy(q->items[q->rear], str); // Copy string to the new position
 // Update front if it was initially -1 (indicating the queue was empty)
 if (q->front == -1) {
 q->front = 0;
 }
 printf("Inserted: %s\n", str);
}
// Function to delete a string from the circular queue
void deletecq(CircularQueue *q) {
 if (isEmpty(q)) {
 printf("Queue is Empty! Cannot delete.\n");
 return;
 }
 printf("Deleted: %s\n", q->items[q->front]);
 // Check if the queue will be empty after this deletion
 if (q->front == q->rear) {
 q->front = -1; // Queue becomes empty
 q->rear = -1;
 } else {
 // Move the front forward
 q->front = (q->front + 1) % MAX;
 }
}
// Function to display all elements in the circular queue
void displaycq(CircularQueue *q) {
 if (isEmpty(q)) {
 printf("Queue is Empty!\n");
 return;
 }
 printf("Queue elements are:\n");
 int i = q->front;
 while (1) {
 printf("%s ", q->items[i]);
 if (i == q->rear) {
 break; // Stop when the rear is reached
 }
 i = (i + 1) % MAX; // Move circularly in the queue
 }
 printf("\n");
}
 int main() {
 CircularQueue q;
 initializeQueue(&q);
 insertcq(&q, "Abc");
 insertcq(&q, "Bcd");
 insertcq(&q, "Cde");
 insertcq(&q, "Def");
 insertcq(&q, "Efg");
 
 displaycq(&q);
 deletecq(&q);
 deletecq(&q);
 displaycq(&q);
 insertcq(&q, "Fgh");
 insertcq(&q, "Ghk");
 displaycq(&q);
 return 0;
}
