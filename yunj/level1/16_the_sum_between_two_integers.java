func solution(a int, b int) int64 {
	var f,l int
	if a > b {
		f, l = a, b
	} else if b > a{
		f, l = b, a
	} else{
		return int64(a)
	}

	res := (f + l) * (f-l+1) / 2



	return int64(res)
}