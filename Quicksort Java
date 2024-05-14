int[] A;
int[] sortArray(int[] A) {
	this.A = A;
	sort(0, A.length - 1);
	return A;
}
void sort(int l, int r) {
	if (l >= r) return;
	int p = part(l, r);
	sort(l, p - 1);
	sort(p + 1, r);
}
int part(int l, int r) {
	int p = A[r];
	int i = l - 1;
	for (int j = i + 1; j < r; ++j)
		if (A[j] < p)
			swap(++i, j);
	swap(i + 1, r);
	return i + 1;
}
void swap(int i, int j) {
	int t = A[i];
	A[i] = A[j];
	A[j] = t;
}
