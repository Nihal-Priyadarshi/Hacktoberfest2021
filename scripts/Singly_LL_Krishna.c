#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>
#define MAX 100

struct node
{
    int num;float marks; char name[MAX];                       //Data of the node
    struct node *next;           //Address of the next node
}*head;

int pos;

void createNodeList(int n); // function to create the list
void displayList();         // function to display the list
float min();
void delete(float min_marks);
void sort();

int main()
{
    int choice,n;
    while(1)
    {
        printf("\nEnter 1 to create the Linked List");
        printf("\nEnter 2 to display Linked List");
        printf("\nEnter 3 to delete data of student with least marks");
        printf("\nEnter 4 to sort the Linked List");
        printf("\nEnter 10 to Exit\n");
        printf("Your choice: ");
        scanf("%d",&choice);
        switch(choice)
        {
        case 1:
            printf("Input the number of nodes : ");
            scanf("%d", &n);
            createNodeList(n);
            break;

        case 2:
              printf("\nData entered in the list : \n");
              displayList();
              break;

        case 3:
            printf("\nDeleted data of student with least marks : \n");
            delete(min());
            break;

        case 4:
            printf("\nLinked List after sorting in increasing order of registration number : \n");
            sort();
            displayList();
            break;

        case 10:
            exit(0);
            break;

        default:
            printf("\nWrong Choice");
        }
    }
}
void createNodeList(int n)
{
    struct node *newnode, *tmp;
    int num, i=1;float marks; char name[MAX];
    head = (struct node *)malloc(sizeof(struct node));

    if(head == NULL) //check whether the newnode is NULL and if so no memory allocation
    {
        printf(" Memory can not be allocated.");
    }
    else
    {
// reads data for the node through keyboard

        printf("Enter name of student %d: \n", i);
        scanf("%s", name);
        printf("Registration number : \n");
        scanf("%d", &num);
        printf("Marks : \n");
        scanf("%f", &marks);
        strcpy(head->name, name);
        head->num = num;
        head->marks= marks;
        head->next = NULL; // links the address field to NULL
        tmp = head;
// Creating n nodes and adding to linked list
        for(i=2; i<=n; i++)
        {
            newnode = (struct node *)malloc(sizeof(struct node));
            if(newnode == NULL)
            {
                printf(" Memory can not be allocated.");
                break;
            }
            else
            {
                printf("Enter name of student %d : \n", i);
                scanf("%s", name);
                printf("Registration number : \n");
                scanf("%d", &num);
                printf("Marks : \n");
                scanf("%f", &marks);
                strcpy(newnode->name, name);
                newnode->marks = marks;
                newnode->num = num;      // links the num field of newnode with num
                newnode->next = NULL; // links the address field of newnode with NULL

                tmp->next = newnode; // links previous node i.e. tmp to the newnode
                tmp = tmp->next;
            }
        }
    }
}
void displayList()
{
    struct node *tmp;
    if(head == NULL)
    {
        printf(" List is empty.");
    }
    else
    {
        printf("NAME\t\tREG. NO.\t\tMARKS\n");
        tmp = head;
        while(tmp != NULL)
        {
            printf("%s\t\t%d\t\t%.2f\n", tmp->name, tmp->num, tmp->marks);       // prints the data of current node
            tmp = tmp->next;                     // advances the position of current node
        }
    }
}

float min()
{
    struct node *curr = head;
    float lowest = head->marks;
    while(curr!=NULL)
    {
        if(curr->marks<lowest)
        {
            lowest = curr->marks;
        }
        curr=curr->next;
    }
    return lowest;
}

void delete(float min_marks)
{   
    printf("NAME\t\tREG. NO.\t\tMARKS\n");
    if(head==NULL)
    return;
    struct node *prev = head, *curr = head;
    if(min_marks==head->marks)
    {
        printf("%s\t\t%d\t\t%.2f\n", head->name,head->num, head->marks);
        head = curr->next;
        return;
    }
    while(curr!=NULL)
    {
        curr=curr->next;
        if(curr->marks==min_marks)
        {
            prev->next=curr->next;
            break;
        }
        prev = curr;
    }
        
    printf("%s\t\t%d\t\t%.2f\n", curr->name,curr->num, curr->marks);
    
}

void swapNodes(struct node *a, struct node *b) {
  struct node tmp = *a;
  a->marks=b->marks;
  a->num=b->num;
  strcpy(a->name, b->name);
  b->num=tmp.num;
  b->marks=tmp.marks;
  strcpy(b->name, tmp.name);
}

void sort() {
  struct node *currentNode, *previousNode;
 // store if there still a difference in the list means that we have some nodes not sorted
  bool difference;
  loopAgain:
    // looping again and assuming no more difference
    difference = false;
    currentNode = previousNode = head;
    while(currentNode != NULL) {
      currentNode = currentNode->next;
      if(currentNode != NULL && previousNode->num > currentNode->num) {
        swapNodes(previousNode, currentNode);
        difference = true;
      }
      previousNode = currentNode;
    }
  // go to loop again since there still maybe no sorted nodes yet
  if(difference) {
    goto loopAgain;
  }
}
