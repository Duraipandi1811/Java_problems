#include <stdio.h>
void binarysearch(int a[], int start, int end, int val)
{
    int mid;

    while (start <= end) {
        mid = start + (end - start) / 2; 

        if (a[mid] == val) {
            printf("Element is found at index %d\n", mid);
            return; 
        } else if (a[mid] < val) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }

    printf("Element is not found\n");
}

int main() {
    int a[] = {12, 23, 34, 45, 56};
    int n = 5;
    int val;

    printf("Enter the value to search for: ");
    scanf("%d", &val);

    binarysearch(a,0, n-1, val);
    return 0;
}
