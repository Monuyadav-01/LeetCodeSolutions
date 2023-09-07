class Solution {
public:
   int jump(vector<int>& nums) {
    int n = nums.size();
    vector<int> store(n);
    store[0] = 0;

    for(int i = 1; i < n; i++){
        store[i] = INT_MAX;
        for(int j = 0; j < i; j++){
            if(i <= nums[j] + j && store[j] != INT_MAX){
                store[i] = min(store[i], store[j] + 1);
                break;
            }
        }
    }
    return store[n-1];
}

};