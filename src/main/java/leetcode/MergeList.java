package leetcode;


import java.util.*;

/**
 *
 *<p> merge the given 2 dimensional array  into one dimensional array order by the same asc order ,  every sub array contains the sequential number </p>
 * @auther guan.c.wang
 * @date 3/16/2022.
 * @see
 */
public class MergeList {
    public static void main(String[] args) {
        Integer[][] arr = new Integer[][]{{1, 3 , 5,7,9}, {2, 4,6,8,10} , {-100 , 100}, {0}};
        Solution s = new Solution();
        List<Integer> result = s.mergeKArray(arr);
        for(Integer i : result){
            System.out.println(i);
        }
    }
}


class Solution {

        public List<Integer> mergeKArray(Integer[][] arr){
            ArrayList<Integer> result = new ArrayList<>();
            ArrayList<Integer[]> list = new ArrayList<>();
            for(int i = 0 ; i < arr.length; i++){
                list.add(arr[i]);
            }
            int size = list.size();
            int[] index =  new int[size];
            do{
                List<Integer> campare_list = new ArrayList<>();
                for(int i = 0 ; i< size ; i ++){
                    if(index[i] != -1 ){
                        Integer header = list.get(i)[index[i]];
                        campare_list.add(header);
                    }else{
                        campare_list.add(Integer.MAX_VALUE);
                    }
                }
                Map<Integer, Integer> map = getministNumber(campare_list);
                Iterator<Integer> iterator = map.keySet().iterator();
                while(iterator.hasNext()){
                    Integer i = iterator.next();
                    if(list.get(i).length -1 > index[i]){
                        index[i] = index[i] + 1;
                    }else{
                        index[i] = -1;
                    }
                }
                result.addAll(Arrays.asList( map.values().toArray(new Integer[]{})));

            }while(checkIndex(index));




            return result;
        }

         Map<Integer , Integer> getministNumber(List<Integer> list){
            HashMap<Integer,Integer> result = new HashMap<>();
            Integer tmp = list.get(0);
            Integer idx = 0;
            for(int i = 1 ; i < list.size() ; i ++){
                if(list.get(i) < tmp){
                    tmp = list.get(i);
                    idx = i;
                }
            }
            result.put(idx , tmp);

            for(int i = 1 ; i < list.size() ; i ++){
                if(list.get(i) == tmp){
                    result.put(i , tmp);
                }
            }

            return result;
        }

       private  boolean checkIndex(int[] index){
            for(int i : index){
                if(i != -1)
                    return  true;
            }
            return false;

        }

    }








