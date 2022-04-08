//Heap Sort 
#include <stdio.h> 
void heapify(int arr[], int n, int i) 
{ 
 int smallest = i; 
 int l = 2 * i + 1; 
 int r = 2 * i + 2; 
 if (l < n && arr[l] < arr[smallest]) 
 smallest = l; 
 if (r < n && arr[r] < arr[smallest]) 
 smallest = r; 
 if (smallest != i) { 
 // swap arr[i] with a[smallest] 
 int temp = arr[i]; 
 arr[i] = arr[smallest]; 
 arr[smallest] = temp; 
 heapify(arr, n, smallest); 
 } 
} 
void heapSort(int arr[], int n) 
{ 
 for (int i = n / 2 - 1; i >= 0; i--) 
 heapify(arr, n, i); 
 for (int i = n - 1; i >= 0; i--) { 
 // swap arr[0] with arr[i] 
 int temp = arr[0]; 
 arr[0] = arr[i]; 
 arr[i] = temp; 
 heapify(arr, i, 0); 
 } 
} 
 
int main() 
{ 
int a[50],n,i; 
printf("Enter the size of the array:"); 
scanf("%d",&n); 
printf("\nEnter the elements:"); 
for(i=0;i<n;i++) 
scanf("%d",&a[i]); 
printf("\nThe list before sorting:"); 
for(i=0;i<n;i++) 
printf("%d ",a[i]); 
heapSort(a,n); 
printf("\nThe list after sorting:"); 
for(i=0;i<n;i++) 
printf("%d ",a[i]); 
} 
