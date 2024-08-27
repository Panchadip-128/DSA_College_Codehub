#include <stdio.h>

int find_len(char str[], int index) {
    if (str[index] == '\0') return 0;
    return (1 + find_len(str, index + 1));
}

int main() {
    char str[] = "Hello, world!";
    int length = find_len(str, 0);
    printf("Length of the string is: %d\n", length);
    return 0;
}