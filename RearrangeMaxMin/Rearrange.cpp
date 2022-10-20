
// C++ program to rearrange an array in minimum and maximum form
#include <iostream>
using namespace std;
void rearrange(int arr[], int n)

   {

    long long temp[n] = {0};

    int l = 0,r = n-1;

    int idx = 0;

    while(l<=r){

        temp[idx++] = arr[r--];

        if(l <= r)

            temp[idx++] = arr[l++];

    }

    for(idx = 0;idx<n;++idx){

        arr[idx] = temp[idx];

    }
   }

int main()
{
    int arr[100];
    int n ;

    cout<<"Enter the size of array: "<<endl;
    cin>>n;
    cout<<"Enter the Array element: "<<endl;
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    cout << "Original Array";
    for (int i = 0; i < n; i++)
        cout << arr[i] << " ";

    rearrange(arr, n);

    cout << "\nModified Array\n";
    for (int i = 0; i < n; i++)
        cout << arr[i] << " ";
    return 0;
}
