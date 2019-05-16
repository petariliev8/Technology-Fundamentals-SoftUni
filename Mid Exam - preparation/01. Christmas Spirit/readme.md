# Problem 1. Christmas Spirit

_It&#39;s time to get in a Christmas mood. You have to decorate the house in time for the big event, but you have limited days to do so._

You will receive **allowed quantity** for **one type** of decoration and **days** left until Christmas day to decorate the house.

There are **4**  **types** of decorations and each piece costs a **price**

- Ornament Set � 2$ a piece
- Tree Skirt � 5$ a piece
- Tree Garlands � 3$ a piece
- Tree Lights � 15$ a piece

Every **second day** you buy an **Ornament Se**** t **quantity of times and** increase **your Christmas spirit by** 5**.

Every **third day** you buy **Tree Skirts** and **Tree Garlands** (both quantity of times) and **increase** your spirit by **13**.

Every **fifth day** you buy **Tree Lights** quantity of times and **increase** your Christmas spirit by **17**. If you have bought Tree Skirts and Tree Garlands at the **same day** you **additionally increase** your spirit by **30**.

Every **tenth day** you **lose 20 spirit** , because your cat ruins all tree decorations and you have to rebuild the tree and buy **one** piece of tree **skirt** , **garlands** and **lights**. That is why you are forced to **increase** the allowed **quantity with 2** at the **beginning** of every **eleventh day**.

Also if the **last day** is a **tenth day** the cat decides to demolish even more and ruins the Christmas turkey and you **lose** additional **30 spirit**.

At the end you must print the **total cost** and the **gained spirit**.

## Input / Constraints

The input will consist of **exactly 2 lines** :

- quantity � **integer in range [1�100]**
- days **� integer in range [1�100]**

## Output

At the end print the **total cost** and the total gained **spirit** in the following format:

- **&quot;Total cost: {budget}&quot;**
- **&quot;Total spirit: {totalSpirit}&quot;**

## Examples

| **Input** | **Output** |
| --- | --- |
| 17 | Total cost: 37Total spirit: 58 |
| **Input** | **Output** |
| 320 | Total cost: 558Total spirit: 156 |