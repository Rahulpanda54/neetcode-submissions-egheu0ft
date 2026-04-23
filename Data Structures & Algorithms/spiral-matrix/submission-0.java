class Solution {
    
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> arr = new ArrayList<>();

  int sr = 0;  int sc = 0;  int er = matrix.length-1;  int ec = matrix[0].length-1;

        while(sr <= er && sc <= ec){

            for(int i=sc; i<=ec; i++){
                arr.add(matrix[sr][i]);
            }

            for(int i=sr+1; i<= er; i++){
                arr.add(matrix[i][ec]);
            }


            for(int i=ec-1; i>=sc; i--){
                
                if(sr == er){
                    break;
                }

                arr.add(matrix[er][i]);
            }

            for(int i=er-1; i>sr; i--){
                  
                  if(sc == ec){
                      break;
                  }

                 arr.add(matrix[i][sc]);
            }


          
            sr++;  sc++;  er--;  ec--;
        }

        return arr;
    }
}
