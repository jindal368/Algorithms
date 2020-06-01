for problem statement visit =>  https://www.hackerrank.com/challenges/append-and-delete/problem




def appendAndDelete(s, t, k):
    count =0 
    for i,j in zip(s,t):
        if(i==j):
            count+=1
        else:
            break
    if(len(s)-count+len(t)-count <=k and (len(s)+len(t))%2==k%2  or len(s)+len(t)<k ):
        return "Yes"
    else:
        return "No"
