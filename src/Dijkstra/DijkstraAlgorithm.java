package Dijkstra;

import java.util.Vector;

/**
 * Created by FlipBook TP300LD on 24.06.2016.
 */
public class DijkstraAlgorithm {


    private int Inf = 2147483647;


    protected Vector<Integer> AlgDijkstra(int start, int end, Integer nSize, Vector<VertexDijkstra> arrOfLen)
    {
//        int [] n = new int[nSize];
        Vector<Integer> vLen = new Vector<>(nSize);//,Inf);    //(nSize);        //, Inf); // Длина путей
        Vector<Integer> realWay = new Vector<>(nSize);//, -1); // Предыдущие значения вершин
        Vector<Integer> u = new Vector<>(nSize);//),0); //Вектор посещенных вершин
        vLen.add(start,0);
        int CurrV=start; //Текущий элемент
        u.add(CurrV,1);
        // Алгоритм

        while(u.elementAt(end)!=1) //Цикл выполняется до тех пор, пока не посетим конечную вершину
        {
            int minLen=Inf;
            for (int v = 0; v < arrOfLen.size(); v++)
            {
                if(arrOfLen.elementAt(v).source == CurrV)
                {
                    if (vLen.elementAt(arrOfLen.elementAt(v).dest) > vLen.elementAt(arrOfLen.elementAt(v).source) + arrOfLen.elementAt(v).length)
                    {
                        vLen.elementAt(arrOfLen.elementAt(v).dest) = vLen.elementAt(arrOfLen.elementAt(v).source + arrOfLen.elementAt(v).length);
                        realWay[arrOfLen.at(v)->dest] = arrOfLen.at(v)->source;
                    }
                }
            }
            for (int i = 0; i< nSize; i++)
            {
                if ((vLen[i] < minLen)&&(u[i]==0))
                {
                    minLen = vLen[i];
                }
            }
            for(int j=0;j< nSize;j++)
            {
                if((u[j]==0)&&(vLen[j]==minLen))
                {
                    CurrV=j;
                }
            }
            u[CurrV]=1;
        }
        //Восстанавлием кратчайший путь
        if (vLen[end] == Inf)
        {
            realWay.clear();
            realWay.append(-1);
        }
        else
        {
            QVector<int> path;
            for (int cur = end; cur != -1; cur = realWay[cur])
                path.append(cur);
            realWay.clear();
            for (int cur = path.size() - 1; cur > -1; cur--)
                realWay.append(path.at(cur));
        }
        return realWay;
    }

}
