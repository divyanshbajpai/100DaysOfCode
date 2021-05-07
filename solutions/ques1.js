// /**
//  * @param {number[]} nums
//  * @return {number}
//  */
 var findMaxConsecutiveOnes = function(nums) {
    count=0;
    longestPattern=0;
    nums.forEach(function(num){
        if (num===1){
            count++;
            if(count>longestPattern)
                longestPattern++;
        }else{
            count = 0;
        }
    })
    return longestPattern;
};