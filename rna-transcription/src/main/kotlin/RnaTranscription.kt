fun transcribeToRna(dna: String): String{
    var rna: String = ""
    for (nucleotide in dna){
        when (nucleotide){
            'G' -> rna += 'C'
            'C' -> rna += 'G'
            'A' -> rna += 'U'
            'T' -> rna += 'A'
        }
    }
    return rna
}
