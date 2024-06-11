//Maximum Tip Calculator
/*
In a restaurant, two waiters, A and B, receive n orders per day, earning tips as per arrays arr[i] and brr[i] respectively.
If A takes the ith order, the tip is arr[i] rupees; if B takes it, the tip is brr[i] rupees.

To maximize total tips, they must distribute the orders such that:

A can handle at most x orders
B can handle at most y orders
Given that x + y ≥ n, all orders can be managed by either A or B. Return the maximum possible total tip after processing all the orders.
*/

//code:
class Solution {
    public static long maxTip(int n, int x, int y, int[] arr, int[] brr) {
        
        return optimum(arr, brr, x, y, n);
        
    }
    
    // greedy
    static class Order{
        int a_tip;
        int b_tip;
        int diff;
        
        Order(int a_tip, int b_tip){
           this.a_tip = a_tip;
           this.b_tip = b_tip;
           this.diff = Math.abs(a_tip - b_tip);
        }
    }
    
    static long optimum(int arr[], int brr[], int x, int y, int n){
        
        ArrayList<Order> orders = new ArrayList<>();
        for(int i = 0; i < n; i++){
            orders.add(new Order(arr[i], brr[i]));
        }
        
        Collections.sort(orders, (o1, o2) -> Integer.compare(o1.diff, o2.diff));
        
        long ans = 0;
        for(int i = n - 1; i >= 0; i--){
            Order o = orders.get(i);
            if((o.a_tip >= o.b_tip && x > 0) || y <= 0){
                ans += o.a_tip;
                x--;
            }else{
                ans += o.b_tip;
                y--;
            }
            
        }
        
        return ans;
    }
    
}
