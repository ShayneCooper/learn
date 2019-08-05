class merge{
    public static int[] mergesort(int[] AList,int[] BList){
        int pivotA = 0;//数组AList 哨兵
        int pivotB = 0;//数组BList 哨兵
        int aLength = AList.length;//数组AList长度
        int bLength = BList.length;//数组BList长度

        int[] temp = new int[aLength+bLength];

        int index = 0;

        while (pivotA < aLength && pivotB < bLength) {
            if (AList[pivotA] <= BList[pivotB]) {
                temp[index++] = AList[pivotA];
                pivotA++;
            } else {
                temp[index++] = BList[pivotB];
                pivotB++;
            }
        }

        if (pivotA < aLength) {
            for (int j = pivotA; j < aLength; j++) {
                temp[index++] = AList[j];
            }
        }

        if (pivotB < bLength) {
            for (int j = pivotB; j < bLength; j++) {
                temp[index++] = BList[j];
            }
        }
        return temp;
    }

    public static void main(String[] args){
        int[] b = {1,2,4,5,7,8,9,32,65,89,100};
        int[] a = {2,3,6,8,22,57,87,233,457,777,33333};
        int[] c = mergesort(a, b);
        for(int d:c){
            System.out.print(d + " ");
        }
        
    }
}