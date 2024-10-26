#include<stdio.h>
#include<stdlib.h>

struct Node
{
    int data;
    struct Node *next;
};

void linkedlistTraversal(struct Node *ptr)
{
    while(ptr!=NULL)
    {
     printf("%d\n",ptr->data);
     ptr= ptr->next;
    }
}

// struct Node* insertAtFirst(struct Node* head,int data)
// {
//     struct Node* ptr= (struct Node*)malloc(sizeof(struct Node));
//     ptr->next=head;
//     ptr->data=data;
//     return ptr;
// }
 
void SelectionSort(struct Node* start)
{
    int temp;
    struct Node *p,*q;
    for(p=start;p->next!=NULL;p=p->next)
    {
        for(q=p->next;q!=NULL;q=q->next)
        {
            if(p->data>q->data)
            {
                temp=p->data;
                p->data=q->data;
                q->data=temp;
            }
        }
    }
}


int main()
{
 struct Node *head;
 struct Node *second;
 struct Node *third;
 struct Node *fourth;


head=(struct Node*)malloc(sizeof(struct Node));
second=(struct Node*)malloc(sizeof(struct Node));
third=(struct Node*)malloc(sizeof(struct Node));
fourth = (struct Node*)malloc(sizeof(struct Node));

head->data=10;
head->next= second;

second->data=9;
second->next=third;

third->data=900;
third->next=fourth;

fourth->data=123;
third->next=NULL;

  printf("Before Selection Sort:\n");
    linkedlistTraversal(head);

    SelectionSort(head);

    printf("After Selection Sort:\n");
    linkedlistTraversal(head); 

free(head);
free(second);
free(third);
free(fourth);

return 0;
}

