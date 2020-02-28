#include <stdio.h>
#include <string.h> 
const char hashTable[10][5] = {"", "", "abc", "def", "ghi", "jkl", 
							"mno", "pqrs", "tuv", "wxyz"}; 

void printWordUtil(int number[],int curr,char output[],int n){
    int i;
    if(curr==n){
        printf("%s ",output);
        return;
    }
    for(i=0;i<strlen(hashTable[number[curr]]);i++){
        output[curr]=hashTable[number[curr]][i];
        printWordUtil(number,curr+1,output,n);
        if(number[curr]==0||number[curr]==1)
        {
            return;
        }   
    }
}
void printWords(int number[],int n){
    char result[n+1];
    result[n]='\0';
    printWordUtil(number,0,result,n);
}
int main() {
	//code
	int number[]={2,3,4};
	int n=sizeof(number)/sizeof(number[0]);
	printWords(number,n);
	return 0;
}
