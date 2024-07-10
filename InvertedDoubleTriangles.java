{\rtf1\ansi\ansicpg1252\cocoartf2761
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 \
public class InvertedDoubleTriangles\
\{\
  public static void main(String[] args)\
    \{\
        int n =9;\
         for(int i=1;i<=n;i++)\
        \{\
            if(i>1)\
            \{\
                 for(int k=1;k<i;k++)\
            \{\
                                    System.out.print(" ");\
            \}\
            \}\
            for(int j=i;j<=n;j++)\
            \{\
                                                    System.out.print(j);\
            \}\
                                                System.out.println(" ");\
                                            \}\
            for(int i=n-1;i>=1;i--)\
        \{\
            for(int j=1;j<=n;j++)\
            \{\
                if(j>=i)\
                \
            \
             System.out.print(j);\
            \
        \
            else\
            System.out.print(" ");\
        \}\
                                                        System.out.println(" ");\
\
    \}\
\}\
\}\
}