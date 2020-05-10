// find all possible subset of a given set including null  i.e, if |array| = n then no of subArray will be : 2^n


a =list(map(int , input("Input an array seprated by a space : ").split(" ")))
s = list(a)
print("Subset is : ")
def calc(a,s,i):
    if(i==len(a)):
        print(s)
    else:
        s[i]='$'
        calc(a,s,i+1)
        s[i]=a[i]
        calc(a,s,i+1)
calc(a,s,0)

