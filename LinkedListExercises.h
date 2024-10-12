
/**
 * @file LinkedListExercises.h
 * University of Illinois CS 400, MOOC 2, Week 1: Linked List
 * Spring 2019
 *                        STUDENT STARTER FILE
 *
 * @author Eric Huber - University of Illinois staff
 *


/********************************************************************
  Week 1: Linked List and Merge Sort Exercises

  There are two exercises in this file. Please read the code comments
  below and see the provided instructions PDF before you begin. The
  other provided code files in the starter zip also contain important
  comments and hints about how to approach this.

  This is the only file you can edit for the sake of grading! You can
  edit the other provided starter files for testing purposes, but the
  autograder will assume that this is the only file that has been edited
  by you, and the others will be replaced with the original intended
  versions at grading time.
 ********************************************************************/

// Prevent the header from being included more than once per cpp file
#pragma once
using namespace std;
// It's good to put system headers first, so that if your own libraries
// cause conflicts, the compiler will most likely identify the problem
// as being in your own source code files, where it arises later.
#include <iostream>
#include <string>

#include "LinkedList.h"

template <typename T>
void LinkedList<T>::insertOrdered(const T& newData) {
Node *newNode = new Node(newData);
if(!head_){
    head_ = tail_=newNode;
}
else if(newData < head_->data){
      newNode->next=head_;
      head_->prev=newNode;
      head_=newNode;
    }
  else{
    Node*temp = head_;
    while(temp->next!=nullptr && temp->next->data<newData){
            temp = temp->next;
        }
          newNode->next = temp->next;
          newNode->prev=temp;
          if(temp->next){
            temp->next->prev=newNode;
          }
          else{
            tail_=newNode;
          }
          temp->next=newNode;
    }
 size_++;
}

template <typename T>
LinkedList<T> LinkedList<T>::merge(const LinkedList<T>& other) const {
    LinkedList<T> left = *this;
  LinkedList<T> right = other;

  LinkedList<T> merged;

    while( false == left.empty() && false == right.empty() )
  {
    T left_front = left.front();
    T right_front = right.front();
    
    if( left_front <= right_front )
    {
      merged.pushBack( left_front );
      left.popFront();
    }
    else
    {
      merged.pushBack( right_front );
      right.popFront();
    }
    
  }

  if( left.empty() )
  {
    while( false == right.empty() )
    {
    
      merged.pushBack( right.front() );
      right.popFront();
    }
  }

  if( right.empty() )
  {
    while( false == left.empty() )
    {
 
      merged.pushBack( left.front() );
      left.popFront();
    }
  }
  
  return merged;
}
   /*/ LinkedList<T> merged;
    Node* left = this->head_;
    Node* right = other.head_;
    Node* last = nullptr;

    if (!left && !right) return merged;
    if (!left) return other;
    if (!right) return *this;

    while ((left!=nullptr) && (right!=nullptr)) {
        if (left->data < right->data) {
            if (merged.head_==nullptr) {
                merged.head_ = left;
                last = left;
            } else {
                last->next = left;
                left->prev = last;
                last = left;
            }
            left = left->next;
        } else {
            if (merged.head_==nullptr) {
                merged.head_ = right;
                last = right;
            } else {
                last->next = right;
                right->prev = last;
                last = right;
            }
            right = right->next;
        }
        merged.size_++;
    }

    if (left) {
        last->next = left;
        left->prev = last;
        while(left->next) left = left->next;
        merged.tail_ = left;
    } 
    if(right) {
        last->next = right;
        right->prev = last;
        while(right->next) right = right->next;
        merged.tail_ = right;
    }
    else{
      merged.tail_ = last;
    }
    last->next = nullptr;
    return merged;
}*/
