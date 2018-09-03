class Example090301 {
	public static void main(String[] args) { //선택정렬
		int arr [] = {5,7,1,2,4,3,8,9,6,10};
		int bye;

		for(int i=0;i<arr.length;i++){

			for(int j=0;j<arr.length;j++){

				if(arr[i]<arr[j]){

					bye=arr[i]; //bye에 arr[i] 값 담아두기
					arr[i]=arr[j]; //arr[i]자리에 arr[j]값 대체
					arr[j]=bye; //arr[j] 자리에 arr[i] 값 대체

				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
