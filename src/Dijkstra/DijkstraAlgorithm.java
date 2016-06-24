package Dijkstra;

import java.util.Vector;

/**
 * Created by FlipBook TP300LD on 24.06.2016.
 */
/*public class DijkstraAlgorithm {
    private long Inf = 2147483648L;//2147483647;

    Vector <VertexDijkstra> a;
    protected Vector<Integer> AlgDijkstra(int start, int end, Integer nSize, Vector<VertexDijkstra> arrOfLen)
    {
        Vector<Integer> vLen(nSize);        //, Inf); // Длина путей
        Vector<Integer> realWay(nSize, -1); // Предыдущие значения вершин
        Vector<Integer> u (nSize,0); //Вектор посещенных вершин
        vLen[start] = 0;
        int CurrV=start; //Текущий элемент
        u[CurrV]=1;
        // Алгоритм
        while(u[end]!=1) //Цикл выполняется до тех пор, пока не посетим конечную вершину
        {
            int minLen=Inf;
            for (int v = 0; v < arrOfLen.size(); v++)
            {
                if(arrOfLen.at(v)->source==CurrV)
                {
                    if (vLen[arrOfLen.at(v)->dest]>vLen[arrOfLen.at(v)->source] + arrOfLen.at(v)->length)
                    {
                        vLen[arrOfLen.at(v)->dest] = vLen[arrOfLen.at(v)->source] + arrOfLen.at(v)->length;
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

}*/
