#include <stdio.h>
int main()
{
	int array[2][2], i,j;
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			printf("Enter the value of array[%d][%d]:",i,j);
			scanf("%d",&array[i][j]);
		}
	}
	printf("The 2-D array elements are:");
	for(i=0;i<2;i++)
	{
        printf("\n");
		for(j=0;j<2;j++)
		{
			printf("\t %d",array[i][j]);
		}
	}
	return 0;
}
