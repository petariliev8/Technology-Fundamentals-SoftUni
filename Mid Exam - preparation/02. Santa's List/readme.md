# Problem 2. Santa&#39;s List

_Its Christmas time and Santa needs your help with creating the list of noisy kids._

## Input

You will receive the **initial list** with noisy kids each of them separated with **&quot;&amp;&quot;**.

After that you will receive **4 types** of commands until you receive **&quot;**** Finished!&quot;**

- **Bad {kidName} -**** adds **a kid at the** start **of the list.  If the kid** already exists** skip this line.
- **Good {kidName}**** - **** removes **the kid with the given name only** if he exists** in the list, otherwise skip this line.
- **Rename {oldName} {newName}**  **–** if the kid with the given **old name** exists **change** his name with the **newer** one. If he **doesn&#39;t exist** skip this line.
- **Rearrange {kidName} -** If the kid exists in the list **remove** him from his **current position** and **add** him at the **end** of the list.

## Constraints

- You won&#39;t receive duplicate names in the initial list

## Output

Print the **list** of all noisy kids joined by **&quot;, &quot;.**

- **&quot;{firstKid}, {secondKid}, …{nthKid}&quot;**

## Examples

| **Input** | **Output** |
| --- | --- |
| Peter&amp;George&amp;MikeBad JoshuaGood PeterFinished! | Joshua, George, Mike |
| **Input** | **Output** |
| Joshua&amp;Aaron&amp;Walt&amp;Dustin&amp;WilliamGood WaltBad Jon Rename Aaron PaulRearrange JonRename Peter GeorgeFinished! | Joshua, Paul, Dustin, William, Jon |