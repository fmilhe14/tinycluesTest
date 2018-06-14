import java.util.*;

public class Main {

    //O(N + (MAX - MIN))
    public static int[] findMissing(Integer[] inputArray){

        if(inputArray.length > 1) {

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            Map<Integer, Integer> presentValues = new HashMap<>();

            //Then we remove occurences of the list (O(N))
            for (int i = 0; i < inputArray.length ; i++) {

                if ((inputArray[i] < min)) {
                    min = inputArray[i];
                }

                else if ((inputArray[i] > max)) {
                    max = inputArray[i];
                }

                presentValues.putIfAbsent(inputArray[i], 1);

            }

            List<Integer> res = new ArrayList<>();

            //For Loop : O(MAX - MIN - 2)
            for (int i = min + 1; i < max ; i++) {

                //We add to the results the interval of integer between two consecutives member of the array
                if (!presentValues.containsKey(i)) {

                    res.add(i);
                }
            }

            return res.stream().mapToInt(i -> i).toArray();
        }

        else {
            return new int[0];
        }

    }

    //O(N)
    public static int counter(Integer[] userIds){

        //We first make a copy of the userIds
        List<Integer> userIdsCopy = new LinkedList<>(Arrays.asList(userIds));
        Set<Integer> uniqueUsersIds = new HashSet<>(userIdsCopy);

        return uniqueUsersIds.size();
    }

    //O(MAX Users During a Day)
    public static int countUniqueUsers(List<Integer[]> userIdsOfAMonth){

        //We will first convert the Integer arrays in Maps

        List<Map<Integer, Integer>> userIdsMaps = new ArrayList<>();

        //O(M) M the Number Of Days in the month
        for(Integer[] usersForOneDay : userIdsOfAMonth){

            Map<Integer, Integer> mapUsersForADay = new HashMap<>();

            //O(N), N the max amount of users seen in a day
            for( int userId: usersForOneDay){

                mapUsersForADay.putIfAbsent(userId, 1);

            }

            userIdsMaps.add(mapUsersForADay);
        }

       Map<Integer, Integer> usersSeenInTheMonth = new HashMap<>();

        //O(M)
        for(Map<Integer, Integer> userIds : userIdsMaps){

            //O(N)
            usersSeenInTheMonth.putAll(userIds);
        }

        //The map contains unique user ids seen in the monthe
        //The final complexity is  O(2MN) = O(2*30*N) = O(N)
        return usersSeenInTheMonth.keySet().size();
    }


}
