{\rtf1\ansi\ansicpg1252\cocoartf1343\cocoasubrtf160
{\fonttbl\f0\fnil\fcharset0 Monaco;}
{\colortbl;\red255\green255\blue255;\red127\green0\blue85;\red0\green0\blue192;\red106\green62\blue62;
\red42\green0\blue255;\red63\green95\blue191;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\tx560\tx1120\tx1680\tx2240\tx2800\tx3360\tx3920\tx4480\tx5040\tx5600\tx6160\tx6720\pardeftab720

\f0\fs22 \cf0 \expnd0\expndtw0\kerning0
\
\pard\tx560\tx1120\tx1680\tx2240\tx2800\tx3360\tx3920\tx4480\tx5040\tx5600\tx6160\tx6720\pardeftab720
\cf2 \expnd0\expndtw0\kerning0
\
CLASS CARDS \
\
public\cf0 \expnd0\expndtw0\kerning0
 \cf2 \expnd0\expndtw0\kerning0
class\cf0 \expnd0\expndtw0\kerning0
 Cards \{\
	\cf2 \expnd0\expndtw0\kerning0
private\cf0 \expnd0\expndtw0\kerning0
 Suit \cf3 \expnd0\expndtw0\kerning0
Mysuit\cf0 \expnd0\expndtw0\kerning0
;\
	\
	\
	\cf2 \expnd0\expndtw0\kerning0
private\cf0 \expnd0\expndtw0\kerning0
 \cf2 \expnd0\expndtw0\kerning0
int\cf0 \expnd0\expndtw0\kerning0
 \cf3 \expnd0\expndtw0\kerning0
myNumber\cf0 \expnd0\expndtw0\kerning0
;\
	\
	\
	\cf2 \expnd0\expndtw0\kerning0
public\cf0 \expnd0\expndtw0\kerning0
 Suit getMysuit() \{\
		\cf2 \expnd0\expndtw0\kerning0
return\cf0 \expnd0\expndtw0\kerning0
 \cf3 \expnd0\expndtw0\kerning0
Mysuit\cf0 \expnd0\expndtw0\kerning0
;\
	\}\
	\
	\cf2 \expnd0\expndtw0\kerning0
public\cf0 \expnd0\expndtw0\kerning0
 \cf2 \expnd0\expndtw0\kerning0
void\cf0 \expnd0\expndtw0\kerning0
 setMysuit(Suit \cf4 \expnd0\expndtw0\kerning0
mysuit\cf0 \expnd0\expndtw0\kerning0
) \{\
		\cf3 \expnd0\expndtw0\kerning0
Mysuit\cf0 \expnd0\expndtw0\kerning0
 = \cf4 \expnd0\expndtw0\kerning0
mysuit\cf0 \expnd0\expndtw0\kerning0
;\
		\
		\
	\}\
	\
	\cf2 \expnd0\expndtw0\kerning0
public\cf0 \expnd0\expndtw0\kerning0
 \cf2 \expnd0\expndtw0\kerning0
int\cf0 \expnd0\expndtw0\kerning0
 getMyNumber() \{\
		\cf2 \expnd0\expndtw0\kerning0
return\cf0 \expnd0\expndtw0\kerning0
 \cf3 \expnd0\expndtw0\kerning0
myNumber\cf0 \expnd0\expndtw0\kerning0
;\
	\}\
	\cf2 \expnd0\expndtw0\kerning0
public\cf0 \expnd0\expndtw0\kerning0
 \cf2 \expnd0\expndtw0\kerning0
int\cf0 \expnd0\expndtw0\kerning0
 setMyNumber(\cf2 \expnd0\expndtw0\kerning0
int\cf0 \expnd0\expndtw0\kerning0
 \cf4 \expnd0\expndtw0\kerning0
myNumber\cf0 \expnd0\expndtw0\kerning0
) \{\
		\cf2 \expnd0\expndtw0\kerning0
return\cf0 \expnd0\expndtw0\kerning0
 \cf2 \expnd0\expndtw0\kerning0
this\cf0 \expnd0\expndtw0\kerning0
.\cf3 \expnd0\expndtw0\kerning0
myNumber\cf0 \expnd0\expndtw0\kerning0
 = \cf4 \expnd0\expndtw0\kerning0
myNumber\cf0 \expnd0\expndtw0\kerning0
;\
		\
		\
		\
	\
	\}\
	\
	\cf2 \expnd0\expndtw0\kerning0
public\cf0 \expnd0\expndtw0\kerning0
 Cards (Suit \cf4 \expnd0\expndtw0\kerning0
aSuit\cf0 \expnd0\expndtw0\kerning0
, \cf2 \expnd0\expndtw0\kerning0
int\cf0 \expnd0\expndtw0\kerning0
 \cf4 \expnd0\expndtw0\kerning0
aNumber\cf0 \expnd0\expndtw0\kerning0
) \{ \
		\
		\cf2 \expnd0\expndtw0\kerning0
this\cf0 \expnd0\expndtw0\kerning0
.\cf3 \expnd0\expndtw0\kerning0
myNumber\cf0 \expnd0\expndtw0\kerning0
 = \cf4 \expnd0\expndtw0\kerning0
aNumber\cf0 \expnd0\expndtw0\kerning0
;\
		\cf2 \expnd0\expndtw0\kerning0
this\cf0 \expnd0\expndtw0\kerning0
.\cf3 \expnd0\expndtw0\kerning0
Mysuit\cf0 \expnd0\expndtw0\kerning0
 = \cf4 \expnd0\expndtw0\kerning0
aSuit\cf0 \expnd0\expndtw0\kerning0
; \
		\
		\
	\}\
	\
	\cf2 \expnd0\expndtw0\kerning0
public\cf0 \expnd0\expndtw0\kerning0
 String toString ()  \{\
		\
		String \cf4 \expnd0\expndtw0\kerning0
numStr\cf0 \expnd0\expndtw0\kerning0
 = \cf2 \expnd0\expndtw0\kerning0
null\cf0 \expnd0\expndtw0\kerning0
;\
		\
		\cf2 \expnd0\expndtw0\kerning0
switch\cf0 \expnd0\expndtw0\kerning0
(\cf2 \expnd0\expndtw0\kerning0
this\cf0 \expnd0\expndtw0\kerning0
.\cf3 \expnd0\expndtw0\kerning0
myNumber\cf0 \expnd0\expndtw0\kerning0
) \{\
		\
		\cf2 \expnd0\expndtw0\kerning0
case\cf0 \expnd0\expndtw0\kerning0
 1: \
			\cf4 \expnd0\expndtw0\kerning0
numStr\cf0 \expnd0\expndtw0\kerning0
 = \cf5 \expnd0\expndtw0\kerning0
"One"\cf0 \expnd0\expndtw0\kerning0
; \
			\cf2 \expnd0\expndtw0\kerning0
break\cf0 \expnd0\expndtw0\kerning0
;\
		\
		\
		\cf2 \expnd0\expndtw0\kerning0
case\cf0 \expnd0\expndtw0\kerning0
 2:\
			\cf4 \expnd0\expndtw0\kerning0
numStr\cf0 \expnd0\expndtw0\kerning0
 = \cf5 \expnd0\expndtw0\kerning0
"Two"\cf0 \expnd0\expndtw0\kerning0
;\
			\cf2 \expnd0\expndtw0\kerning0
break\cf0 \expnd0\expndtw0\kerning0
;\
			\
		\cf2 \expnd0\expndtw0\kerning0
case\cf0 \expnd0\expndtw0\kerning0
 3: \
			\cf4 \expnd0\expndtw0\kerning0
numStr\cf0 \expnd0\expndtw0\kerning0
 = \cf5 \expnd0\expndtw0\kerning0
"Three"\cf0 \expnd0\expndtw0\kerning0
; \
			\cf2 \expnd0\expndtw0\kerning0
break\cf0 \expnd0\expndtw0\kerning0
;\
			\
		\cf2 \expnd0\expndtw0\kerning0
case\cf0 \expnd0\expndtw0\kerning0
 4: \
			\cf4 \expnd0\expndtw0\kerning0
numStr\cf0 \expnd0\expndtw0\kerning0
 = \cf5 \expnd0\expndtw0\kerning0
"Four"\cf0 \expnd0\expndtw0\kerning0
; \
			\cf2 \expnd0\expndtw0\kerning0
break\cf0 \expnd0\expndtw0\kerning0
;\
			\
		\cf2 \expnd0\expndtw0\kerning0
case\cf0 \expnd0\expndtw0\kerning0
 5:\
		\cf4 \expnd0\expndtw0\kerning0
numStr\cf0 \expnd0\expndtw0\kerning0
 = \cf5 \expnd0\expndtw0\kerning0
"Five"\cf0 \expnd0\expndtw0\kerning0
;\
		\cf2 \expnd0\expndtw0\kerning0
break\cf0 \expnd0\expndtw0\kerning0
;\
		\
		\cf2 \expnd0\expndtw0\kerning0
case\cf0 \expnd0\expndtw0\kerning0
 6:\
			\cf4 \expnd0\expndtw0\kerning0
numStr\cf0 \expnd0\expndtw0\kerning0
 = \cf5 \expnd0\expndtw0\kerning0
"King"\cf0 \expnd0\expndtw0\kerning0
;\
			\cf2 \expnd0\expndtw0\kerning0
break\cf0 \expnd0\expndtw0\kerning0
;\
			\
		\cf2 \expnd0\expndtw0\kerning0
case\cf0 \expnd0\expndtw0\kerning0
 7:\
			\cf4 \expnd0\expndtw0\kerning0
numStr\cf0 \expnd0\expndtw0\kerning0
 = \cf5 \expnd0\expndtw0\kerning0
"Queen"\cf0 \expnd0\expndtw0\kerning0
; \
			\cf2 \expnd0\expndtw0\kerning0
break\cf0 \expnd0\expndtw0\kerning0
;\
			\
		\cf2 \expnd0\expndtw0\kerning0
case\cf0 \expnd0\expndtw0\kerning0
 9: \
			\cf4 \expnd0\expndtw0\kerning0
numStr\cf0 \expnd0\expndtw0\kerning0
 = \cf5 \expnd0\expndtw0\kerning0
"Ace"\cf0 \expnd0\expndtw0\kerning0
; \
			\cf2 \expnd0\expndtw0\kerning0
break\cf0 \expnd0\expndtw0\kerning0
;\
			\
		\cf2 \expnd0\expndtw0\kerning0
case\cf0 \expnd0\expndtw0\kerning0
 10: \
			\cf4 \expnd0\expndtw0\kerning0
numStr\cf0 \expnd0\expndtw0\kerning0
 = \cf5 \expnd0\expndtw0\kerning0
"Jack"\cf0 \expnd0\expndtw0\kerning0
;\
			\cf2 \expnd0\expndtw0\kerning0
break\cf0 \expnd0\expndtw0\kerning0
;\
			\
			\
			\
		\
		\
		\}\
		\cf2 \expnd0\expndtw0\kerning0
return\cf0 \expnd0\expndtw0\kerning0
 \cf4 \expnd0\expndtw0\kerning0
numStr\cf0 \expnd0\expndtw0\kerning0
;\
		\
		\
		\
	    \}\
\} \
\
\
\
\
\
\
\
CLASS SUIT \
\
\
\
\
\
\cf2 \expnd0\expndtw0\kerning0
public\cf0 \expnd0\expndtw0\kerning0
 \cf2 \expnd0\expndtw0\kerning0
enum\cf0 \expnd0\expndtw0\kerning0
 Suit \{\
\
\cf3 \expnd0\expndtw0\kerning0
Spades\cf0 \expnd0\expndtw0\kerning0
,\
\cf3 \expnd0\expndtw0\kerning0
Diamonds\cf0 \expnd0\expndtw0\kerning0
, \
\cf3 \expnd0\expndtw0\kerning0
Clubs\cf0 \expnd0\expndtw0\kerning0
, \
\cf3 \expnd0\expndtw0\kerning0
Hearts\cf0 \expnd0\expndtw0\kerning0
,\
\}\
\
\
\
CLASS PILE\
\
\cf2 \expnd0\expndtw0\kerning0
import\cf0 \expnd0\expndtw0\kerning0
 \expnd0\expndtw0\kerning0
\ul \ulc0 java. util. Random\expnd0\expndtw0\kerning0
\ulnone ; \
\
\pard\tx560\tx1120\tx1680\tx2240\tx2800\tx3360\tx3920\tx4480\tx5040\tx5600\tx6160\tx6720\pardeftab720
\cf6 \expnd0\expndtw0\kerning0
/***\cf0 \expnd0\expndtw0\kerning0
\
\cf6 \expnd0\expndtw0\kerning0
 * Used java. \expnd0\expndtw0\kerning0
\ul \ulc6 util\expnd0\expndtw0\kerning0
\ulnone . Random; because we need to do deck shuffling (Took help from the tutor) \cf0 \expnd0\expndtw0\kerning0
\
\cf6 \expnd0\expndtw0\kerning0
 * \cf0 \expnd0\expndtw0\kerning0
\
\cf6 \expnd0\expndtw0\kerning0
 * \cf0 \expnd0\expndtw0\kerning0
\
\cf6 \expnd0\expndtw0\kerning0
 * \cf0 \expnd0\expndtw0\kerning0
\
\cf6 \expnd0\expndtw0\kerning0
 *\cf0 \expnd0\expndtw0\kerning0
\
\cf6 \expnd0\expndtw0\kerning0
 */\cf0 \expnd0\expndtw0\kerning0
\
\
\
\
\pard\tx560\tx1120\tx1680\tx2240\tx2800\tx3360\tx3920\tx4480\tx5040\tx5600\tx6160\tx6720\pardeftab720
\cf2 \expnd0\expndtw0\kerning0
public\cf0 \expnd0\expndtw0\kerning0
 \cf2 \expnd0\expndtw0\kerning0
class\cf0 \expnd0\expndtw0\kerning0
 Pile \{\
\
	\
	\cf2 \expnd0\expndtw0\kerning0
private\cf0 \expnd0\expndtw0\kerning0
 \cf2 \expnd0\expndtw0\kerning0
int\cf0 \expnd0\expndtw0\kerning0
 \cf3 \expnd0\expndtw0\kerning0
numCards\cf0 \expnd0\expndtw0\kerning0
;\
	\cf2 \expnd0\expndtw0\kerning0
private\cf0 \expnd0\expndtw0\kerning0
 Cards [] \cf3 \expnd0\expndtw0\kerning0
myCards\cf0 \expnd0\expndtw0\kerning0
;\
	\cf2 \expnd0\expndtw0\kerning0
public\cf0 \expnd0\expndtw0\kerning0
 \cf2 \expnd0\expndtw0\kerning0
int\cf0 \expnd0\expndtw0\kerning0
 getNumCards() \{\
		\cf2 \expnd0\expndtw0\kerning0
return\cf0 \expnd0\expndtw0\kerning0
 \cf3 \expnd0\expndtw0\kerning0
numCards\cf0 \expnd0\expndtw0\kerning0
;\
	\}\
	\cf2 \expnd0\expndtw0\kerning0
public\cf0 \expnd0\expndtw0\kerning0
 \cf2 \expnd0\expndtw0\kerning0
void\cf0 \expnd0\expndtw0\kerning0
 setNumCards(\cf2 \expnd0\expndtw0\kerning0
int\cf0 \expnd0\expndtw0\kerning0
 \cf4 \expnd0\expndtw0\kerning0
numCards\cf0 \expnd0\expndtw0\kerning0
) \{\
		\cf2 \expnd0\expndtw0\kerning0
this\cf0 \expnd0\expndtw0\kerning0
.\cf3 \expnd0\expndtw0\kerning0
numCards\cf0 \expnd0\expndtw0\kerning0
 = \cf4 \expnd0\expndtw0\kerning0
numCards\cf0 \expnd0\expndtw0\kerning0
;\
	\}\
	\cf2 \expnd0\expndtw0\kerning0
public\cf0 \expnd0\expndtw0\kerning0
 Cards [] getMyCards() \{\
		\cf2 \expnd0\expndtw0\kerning0
return\cf0 \expnd0\expndtw0\kerning0
 \cf3 \expnd0\expndtw0\kerning0
myCards\cf0 \expnd0\expndtw0\kerning0
;\
	\}\
	\cf2 \expnd0\expndtw0\kerning0
public\cf0 \expnd0\expndtw0\kerning0
 \cf2 \expnd0\expndtw0\kerning0
void\cf0 \expnd0\expndtw0\kerning0
 setMyCards(Cards [] \cf4 \expnd0\expndtw0\kerning0
myCards\cf0 \expnd0\expndtw0\kerning0
) \{\
		\cf2 \expnd0\expndtw0\kerning0
this\cf0 \expnd0\expndtw0\kerning0
.\cf3 \expnd0\expndtw0\kerning0
myCards\cf0 \expnd0\expndtw0\kerning0
 = \cf4 \expnd0\expndtw0\kerning0
myCards\cf0 \expnd0\expndtw0\kerning0
; \}\
		\
		\cf2 \expnd0\expndtw0\kerning0
public\cf0 \expnd0\expndtw0\kerning0
 Pile(\cf2 \expnd0\expndtw0\kerning0
boolean\cf0 \expnd0\expndtw0\kerning0
 \cf4 \expnd0\expndtw0\kerning0
shuffle\cf0 \expnd0\expndtw0\kerning0
, \cf2 \expnd0\expndtw0\kerning0
int\cf0 \expnd0\expndtw0\kerning0
 \cf4 \expnd0\expndtw0\kerning0
numPile\cf0 \expnd0\expndtw0\kerning0
) \{\
			\
			\cf2 \expnd0\expndtw0\kerning0
int\cf0 \expnd0\expndtw0\kerning0
 \cf4 \expnd0\expndtw0\kerning0
numPiles\cf0 \expnd0\expndtw0\kerning0
 = 0;\
			\cf2 \expnd0\expndtw0\kerning0
this\cf0 \expnd0\expndtw0\kerning0
.\cf3 \expnd0\expndtw0\kerning0
numCards\cf0 \expnd0\expndtw0\kerning0
 = \cf4 \expnd0\expndtw0\kerning0
numPiles\cf0 \expnd0\expndtw0\kerning0
 * 52; \
			\
	\
	\}\
	\
\
\}\
}