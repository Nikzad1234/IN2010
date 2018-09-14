public interface BSTOper {

    public void add( int value );// Legger til onsket node // ok
    public boolean remove(int value );//fjerner onsket node // ok
    public int size(); // returnere antall noder i treet // ok

    public boolean existsInTree( int value );// Eksisterer bestemt node i treet// ok
    public int findNearestSmallerThan( int value );//finne verdien som er mindre enn value men er nærmest value
    public void addAll( int[] integers );//legger alle elementene i integers inn i det binære søketreet. // ok
    public int[] sortedArray() ; // inorder // inorder // returnerer en heltallsarray med verdiene i treet i stigende orden (sortert).
    public int[] findInRange (int low, int high);// finne alle verdier mellom low og high i treet ditt


}
