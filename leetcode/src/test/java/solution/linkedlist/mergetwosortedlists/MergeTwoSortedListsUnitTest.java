package solution.linkedlist.mergetwosortedlists;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static solution.linkedlist.mergetwosortedlists.ListNodeUitls.createSimpleLinkedList;

public class MergeTwoSortedListsUnitTest {

    MergeTwoSortedLists solution = new MergeTwoSortedLists();

    @Test(dataProvider = "dataProvider")
    public void testMergeTwoLists(ListNode list1, ListNode list2, ListNode resultedList) {
        assertThat(solution.mergeTwoLists(list1, list2)).isEqualTo(resultedList);
    }

    @DataProvider
    private Object[][] dataProvider() {
        return new Object[][]{
                {
                        createSimpleLinkedList(asList(-3, -1, 2, 6, 9)),
                        createSimpleLinkedList(asList(0, 2, 14)),
                        createSimpleLinkedList(asList(-3, -1, 0, 2, 2, 6, 9, 14))
                },
                {
                        createSimpleLinkedList(asList(1, 1, 1, 2, 4)),
                        createSimpleLinkedList(asList(1, 3, 4)),
                        createSimpleLinkedList(asList(1, 1, 1, 1, 2, 3, 4, 4))
                },
                {
                        createSimpleLinkedList(List.of(5)),
                        createSimpleLinkedList(asList(1, 2, 4)),
                        createSimpleLinkedList(asList(1, 2, 4, 5)),
                },
                {
                        createSimpleLinkedList(asList(1, 3, 4)),
                        createSimpleLinkedList(asList(1, 2)),
                        createSimpleLinkedList(asList(1, 1, 2, 3, 4))
                },
                {
                        createSimpleLinkedList(List.of(1)),
                        createSimpleLinkedList(List.of(1)),
                        createSimpleLinkedList(asList(1, 1))
                }
        };
    }
}