#include <stdio.h>
#include <stdlib.h>
#define N 10 // Total size of the array
#define MID N/2 // Middle index for splitting the array
// Structure to represent two circular queues
typedef struct {
 int arr[N]; // Array to hold both queues
 int front1, rear1; // Front and rear for the first queue
 int front2, rear2; // Front and rear for the second queue
} TwoCircularQueues;
// Function to initialize both circular queues
void initializeQueues(TwoCircularQueues* q) {
 q->front1 = -1; // Initialize front and rear for Queue 1
 q->rear1 = -1;
 q->front2 = MID + 1; // Initialize front and rear for Queue 2
 q->rear2 = MID + 1;
}
// Function to check if the first queue is full
int isFullQueue1(TwoCircularQueues* q) {
 return ((q->rear1 + 1) % (MID + 1) == q->front1);
}
// Function to check if the second queue is full
int isFullQueue2(TwoCircularQueues* q) {
 return ((q->rear2 + 1) % N == q->front2);
}
// Function to check if the first queue is empty
int isEmptyQueue1(TwoCircularQueues* q) {
 return (q->front1 == -1);
}
// Function to check if the second queue is empty
int isEmptyQueue2(TwoCircularQueues* q) {
 return (q->front2 == MID + 1);
}
// Function to insert an element into the first circular queue
void insertcq1(TwoCircularQueues* q, int value) {
 if (isFullQueue1(q)) {
 printf("Queue 1 is Full! Cannot insert %d.\n", value);
 return;
 }
 if (isEmptyQueue1(q)) { // If queue is initially empty
 q->front1 = 0;
 }
 q->rear1 = (q->rear1 + 1) % (MID + 1);
 q->arr[q->rear1] = value;
 printf("Inserted %d into Queue 1.\n", value);
}
// Function to insert an element into the second circular queue
void insertcq2(TwoCircularQueues* q, int value) {
 if (isFullQueue2(q)) {
 printf("Queue 2 is Full! Cannot insert %d.\n", value);
 return;
 }
 if (isEmptyQueue2(q)) { // If queue is initially empty
 q->front2 = MID + 1;
 }
 q->rear2 = (q->rear2 + 1) % N;
 q->arr[q->rear2] = value;
 printf("Inserted %d into Queue 2.\n", value);
}
// Function to delete an element from the first circular queue
void deletecq1(TwoCircularQueues* q) {
 if (isEmptyQueue1(q)) {
 printf("Queue 1 is Empty! Cannot delete.\n");
 return;
 }
 printf("Deleted %d from Queue 1.\n", q->arr[q->front1]);
 if (q->front1 == q->rear1) { // Queue has only one element
 q->front1 = -1;
 q->rear1 = -1;
 } else {
 q->front1 = (q->front1 + 1) % (MID + 1);
 }
}
// Function to delete an element from the second circular queue
void deletecq2(TwoCircularQueues* q) {
 if (isEmptyQueue2(q)) {
 printf("Queue 2 is Empty! Cannot delete.\n");
 return;
 }
 printf("Deleted %d from Queue 2.\n", q->arr[q->front2]);
 if (q->front2 == q->rear2) { // Queue has only one element
 q->front2 = MID + 1;
 q->rear2 = MID + 1;
 } else {
 q->front2 = (q->front2 + 1) % N;
 }
}
// Function to display elements of the first circular queue
void displaycq1(TwoCircularQueues* q) {
 if (isEmptyQueue1(q)) {
 printf("Queue 1 is Empty!\n");
 return;
 }
 printf("Queue 1 elements: ");
 int i = q->front1;
 while (1) {
 printf("%d ", q->arr[i]);
 if (i == q->rear1) break;
 i = (i + 1) % (MID + 1);
 }
 printf("\n");
}
// Function to display elements of the second circular queue
void displaycq2(TwoCircularQueues* q) {
 if (isEmptyQueue2(q)) {
 printf("Queue 2 is Empty!\n");
 return;
 }
 printf("Queue 2 elements: ");
 int i = q->front2;
 while (1) {
 printf("%d ", q->arr[i]);
 if (i == q->rear2) break;
 i = (i + 1) % N;
 }
 printf("\n");
}
// Main function to demonstrate the functionality
int main() {
 TwoCircularQueues q;
 initializeQueues(&q);
 // Inserting elements into both queues
 insertcq1(&q, 10);
 insertcq1(&q, 20);
 insertcq1(&q, 30);
 insertcq2(&q, 40);
 insertcq2(&q, 50);
 insertcq2(&q, 60);
 // Displaying elements of both queues
 displaycq1(&q);
 displaycq2(&q);
 // Deleting elements from both queues
 deletecq1(&q);
 deletecq2(&q);
 // Displaying elements after deletion
 displaycq1(&q);
 displaycq2(&q);
 return 0;
}
