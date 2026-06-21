class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>stack=new Stack<>();

        for(int asteroid:asteroids){
            boolean add=true;

            while(!stack.isEmpty() &&
            asteroid<0&&
            stack.peek()>0
            ){
                
                if(stack.peek() < -asteroid){
                    stack.pop();
                }
                else if(stack.peek() == -asteroid){
                    add=false;
                    stack.pop();
                    break;
                }
                else if(stack.peek() > -asteroid){
                    add=false;
                    break;
                }
            }

            if(add){
                stack.add(asteroid);
            }
        }

        int[]result=new int[stack.size()];

        for(int i=stack.size()-1;i>=0;i--){
            result[i]=stack.pop();
        }

        return result;
    }
}