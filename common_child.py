def maxSequence(s1,s2):
     arr = [[0 for _ in range (len(s1)+1)] for _ in range(len(s2)+1)]
     for i in range(0,len(s1)):
        for j in range(0,len(s2)):
             if(s1[i]==s2[j]):
                arr[i+1][j+1]=1+arr[i][j]
              else:
                arr[i+1][j+1]=max(arr[i][j+1],arr[i+1][j])
   
    return max(max(arr))

//.....
maxSequence("ABCD","CVND")
