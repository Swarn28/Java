package FlatListSCL;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FlatListService {

    FlatListCreation listCreation = new FlatListCreation();

    public static void main(String[] args) {
        FlatListCreation listCreation = new FlatListCreation();
        List<List<MeterRow>> finalList = listCreation.setup();
        List<List<MeterRow>> finalSortedList = new ArrayList<>();

            List<MeterRow> sortedFlattenedList = finalList.stream()
                    .flatMap(List::stream).sorted(Comparator.comparing(list -> list.address.getData())).collect(Collectors.toList());

            // Step 2: Replace the original unsorted lists with the sorted inner lists
        int innerListSize = finalList.get(0).size(); // Assuming all inner lists have the same size
        for (int i = 0; i < finalList.size(); i++) {
            List<MeterRow> innerList = sortedFlattenedList.subList(i * innerListSize, (i + 1) * innerListSize);
            finalList.set(i, innerList);
        }

            // Step 4: Replace the original unsorted lists with the sorted inner lists
            //  finalList.clear();
            //   finalSortedList.addAll(sortedListOfLists);


            // finalList.stream().flatMap(list -> list.stream().sorted(Comparator.comparing(MeterRow::getMeterId))).collect(Collectors.toList());


        System.out.println("Created List..");

    }

}
