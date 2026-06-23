import java.util.*;
class Solution {
    public int[] findEvenNumbers(int[] digits) {
                int n=digits.length;
       
        int a[]=new  int[450];

        int x=0;
        for(int i=0;i<n;i++)
        {
            if(digits[i]!=0)
            {
            for(int j=0;j<n;j++)
            {
                if(j!=i)
                {
                for(int k=0;k<n;k++)
                {
                     if((k!=i)&&(k!=j))
                     {
                        if(digits[k]%2==0)
                        {
                            int flag=0;
                            int t=(digits[i]*100)+(digits[j]*10)+digits[k];
                            for(int l=0;l<x;l++)
                            {
                                if(t==a[l])
                                {
                                flag=1;
                                break;
                                }
                            }
                            if(flag==0)
                            a[x++]=t;
                        }
                     }
                }
            }
            }
        }
        }
        int b[]=new int[x];
        for(int i=0;i<x;i++)
        {
            b[i]=a[i];
        }
        Arrays.sort(b);
        return b;
    }
}
