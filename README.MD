

## 📌 The Mindset of a Competitive Programmer  

```cpp
#include <iostream>
#include <vector>
#include <algorithm>

int main() {
    std::vector<int> difficulties = {5, 3, 8, 2, 7}; 
    std::sort(difficulties.begin(), difficulties.end()); 

    std::cout << "Face challenges like a competitive programmer! \\n";
    std::cout << "Sorted problems by difficulty: ";
    
    for (int d : difficulties) {
        std::cout << d << " ";
    }

    std::cout << "\\nKeep solving, keep improving! \\n";
    
    return 0;
}
