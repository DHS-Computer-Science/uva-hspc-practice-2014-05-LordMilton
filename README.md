# Practice 2014 - 05: Safe Zone

## Background
Saruman’s army has mounted their seige upon Helm’s Deep, and are unleashing
volley after volley of arrows on its walls – but the Rohirrim have only enough
shields to defend a segment of Helm’s Deep’s walls! The Uruk-hai orcs are
beating at the gate, and Saruman himself assaults your walls with sorcerous
missiles cast from his tower at Isengard. You are a soldier in King Theoden’s
army – with the walls shaking under your very feet, you must make your way to
cover before the next volley of arrows land!

From left to right, the segments of the wall are labelled 0 to (N -1), and you
are currently at segment J. The Rohirrim shields cover from P to Q, and you have
time to make exactly K steps (each step can be either left or right) before the
next volley of arrows lands (the wall’s rumbling makes it impossible to stand
still). How many different combinations of steps can get you to safety?

## Description

### Input
Input is given in the form of a single line per test case, with the
order N P Q J K. The size of the wall is N , the safe zone is from P to Q, the
starting position is at J, and the number of steps is K. A line with N equal
to 0 marks the end of input and should not produce output.

Note that you cannot walk off the end of the wall. This means that if you are at
either end of the wall, you must walk toward the center.

### Output
For each test case, output on one line the number of ways to end up in the safe
zone in K steps.

## Sample
### Input
```
4 0 1 2 2
4 0 1 2 3
16 2 3 7 13
0 0 0 0 0
```

### Output
```
1
3
715
```
