//Input:
N = 2
valueN[] = {4,5}
M = 3
valueM[] = {3,4,5}
Output: 3 9 0  
Explanation: For the given two linked
list (4 5) and (3 4 5), after adding
the two linked list resultant linked
list will be (3 9 0).


//function
struct Node* addTwoLists(struct Node* first, struct Node* second)
{
     struct Node* head = NULL;
    stack<int> s1;
    stack<int> s2;
    while(first!=NULL ){
        s1.push(first->data);
        first = first->next;
    }
    while(second!=NULL ){
        s2.push(second->data);
        second = second->next;
    }
    int carry=0,temp=0;
    while(!s1.empty() && !s2.empty()){
        temp = s1.top() + s2.top()+carry;
        s1.pop();
        s2.pop();
        carry=0;
        if(temp>=10){
            carry=1;
            temp = temp-10;
        }
        
        struct Node* new_node = (struct Node*) malloc(sizeof(struct Node));
        new_node->data = temp;
        new_node->next  = head;
        head= new_node;
    }
    if(s2.empty()){
        
        while(!s1.empty()){
        struct Node* new_node = (struct Node*) malloc(sizeof(struct Node));
        if(s1.top()+carry<10){
        new_node->data = s1.top()+carry;
        new_node->next  = head;
        head= new_node;
        s1.pop();
        carry=0;
        }
        else{
        new_node->data = s1.top()+carry-10;
        new_node->next  = head;
        head= new_node;
        s1.pop();
        carry=1; 
        }
        }
    }
     if(carry!=0 && s1.empty() && s2.empty()){
     struct Node* new_node = (struct Node*) malloc(sizeof(struct Node));
        new_node->data = 1;
        new_node->next  = head;
        head= new_node;   
    }
    else{
        while(!s2.empty()){
        struct Node* new_node = (struct Node*) malloc(sizeof(struct Node));
        if(s2.top()+carry<10){
        new_node->data = s2.top()+carry;
        new_node->next  = head;
        head= new_node;
        s2.pop();
        carry=0;
        }
        else{
        new_node->data = s2.top()+carry-10;
        new_node->next  = head;
        head= new_node;
        s2.pop();
        carry=1; 
        }
        }
    }
    return head;
}
