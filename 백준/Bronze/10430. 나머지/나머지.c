#include <stdio.h>
int main(void)
{
    int a,b,c;
    scanf("%d %d %d",&a,&b,&c);
    int s1 = (a+b)%c;
    int s2 = ((a%c)+(b%c))%c;
    int s3 = (a*b)%c;
    int s4 = ((a%c)*(b%c))%c;
    printf("%d\n",s1);
    printf("%d\n",s2);
    printf("%d\n",s3);
    printf("%d\n",s4);
    return 0;
}