  #include<iostream>
  using namespace std;
  int partition(int a[],int low,int high){
      int pivot=a[low],i=(low+1),j=high,temp;
      while(1){
       while(a[i]<=pivot && i<=high){
           i++;
        }
      while(a[j]>pivot && j>=low){
          j--;}
      if(i<j){
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
       }
      else {
       a[low]=a[j];
       a[j]=pivot;
       return j;}
  }
  }
  void quicksort(int a[],int low,int high){
   int pivot_pos;
   if(low<high){
   pivot_pos=partition(a,low,high);
   quicksort(a,low,pivot_pos-1);
   quicksort(a,pivot_pos+1,high);
  }
  }
  int main(){
  int n;
  cout<<"enter n:";
  cin>>n;
  int a[n];
  cout<<"enter elements \n";
  for(int i=0;i<n;i++){
      cin>>a[i];}
  quicksort(a,0,n-1);
  cout<<"the sorted array is \n";
  for(int i=0;i<n;i++){
   cout<<a[i]<<" ";
  }
  return  0;
  }
