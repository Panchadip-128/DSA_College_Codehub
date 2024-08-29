#include <stdio.h>
#include <stdlib.h>

#define MAX 100

typedef struct {
    int *array;
    int *tops;
    int stack_count;
    int stack_size;
} MultipleStacks;

int i,j;

void initStacks(MultipleStacks *stacks, int stack_count, int stack_size) {
    stacks->stack_count = stack_count;
    stacks->stack_size = stack_size;
    stacks->array = (int *)malloc(stack_count * stack_size * sizeof(int));
    stacks->tops = (int *)malloc(stack_count * sizeof(int));
    for (i = 0; i < stack_count; i++) {
        stacks->tops[i] = -1;
    }
}

int index(MultipleStacks *stacks, int stack_num) {
    return stack_num * stacks->stack_size + stacks->tops[stack_num];
}

void ADD(MultipleStacks *stacks, int stack_num, int value) {
    if (stacks->tops[stack_num] < stacks->stack_size - 1) {
        stacks->tops[stack_num]++;
        stacks->array[index(stacks, stack_num)] = value;
    } else {
        printf("Stack %d is full\n", stack_num);
    }
}

int DELETE(MultipleStacks *stacks, int stack_num) {
    if (stacks->tops[stack_num] >= 0) {
        int value = stacks->array[index(stacks, stack_num)];
        stacks->array[index(stacks, stack_num)] = 0;
        stacks->tops[stack_num]--;
        return value;
    } else {
        printf("Stack %d is empty\n", stack_num);
        return -1;
    }
}

void display(MultipleStacks *stacks) {
    for (i = 0; i < stacks->stack_count; i++) {
        printf("Stack %d: ", i);
        for (j = 0; j <= stacks->tops[i]; j++) {
            printf("%d ", stacks->array[i * stacks->stack_size + j]);
        }
        printf("\n");
    }
}

int main() {
    int n = 3;  // Number of stacks
    int stack_size = 5;  // Size of each stack
    MultipleStacks stacks;
    initStacks(&stacks, n, stack_size);

    ADD(&stacks, 0, 10);
    ADD(&stacks, 0, 20);
    ADD(&stacks, 1, 30);
    ADD(&stacks, 2, 40);
    DELETE(&stacks, 0);
    display(&stacks);

    free(stacks.array);
    free(stacks.tops);

    return 0;
}
