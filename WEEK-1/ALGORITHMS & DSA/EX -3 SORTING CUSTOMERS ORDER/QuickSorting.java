public class QuickSorting {
    

        // Quick Sort to sort orders by totalPrice
        public void quickSort(Order[] orders, int low, int high) {
            if (low < high) {
                int pi = partition(orders, low, high);
    
                quickSort(orders, low, pi - 1);
                quickSort(orders, pi + 1, high);
            }
        }
    
        private int partition(Order[] orders, int low, int high) {
            double pivot = orders[high].getTotalPrice();
            int i = (low - 1);
    
            for (int j = low; j < high; j++) {
                if (orders[j].getTotalPrice() <= pivot) {
                    i++;
    
                    // Swap orders[i] and orders[j]
                    Order temp = orders[i];
                    orders[i] = orders[j];
                    orders[j] = temp;
                }
            }
    
            // Swap orders[i + 1] and orders[high] (or pivot)
            Order temp = orders[i + 1];
            orders[i + 1] = orders[high];
            orders[high] = temp;
    
            return i + 1;
        }
    
    
    
}