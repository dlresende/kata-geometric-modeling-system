# Geometric Modeling System

The geometric modeling system problem was inspired from professor Jon Pearce's notes on [The Open-Closed Principle (OCP)](http://www.cs.sjsu.edu/~pearce/cs251b/principles/ocp.htm).

The problem is an exercise to apply and understand the Open-Closed Principle.

## Problem

Add a new shape Square without modifying any other component of the application.

## Motivation

In the current state, to every new shape we want to add, we need to modify existing classes in the system. Nevertheless, the Open-Closed principle says that applications should be open for extension but closed for modification. In order to satisfy this principle, we need to redesign our application.