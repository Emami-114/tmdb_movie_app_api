package com.example.tmdb_movie_app.model


import com.google.gson.annotations.SerializedName

data class WatchPro(
    @SerializedName("id")
    val id: Int,
    @SerializedName("results")
    val results: Results
) {
    data class Results(
        @SerializedName("AE")
        val aE: AE,
        @SerializedName("AL")
        val aL: AL,
        @SerializedName("AR")
        val aR: AR,
        @SerializedName("AT")
        val aT: AT,
        @SerializedName("AU")
        val aU: AU,
        @SerializedName("BA")
        val bA: BA,
        @SerializedName("BB")
        val bB: BB,
        @SerializedName("BE")
        val bE: BE,
        @SerializedName("BG")
        val bG: BG,
        @SerializedName("BH")
        val bH: BH,
        @SerializedName("BO")
        val bO: BO,
        @SerializedName("BR")
        val bR: BR,
        @SerializedName("BS")
        val bS: BS,
        @SerializedName("CA")
        val cA: CA,
        @SerializedName("CH")
        val cH: CH,
        @SerializedName("CL")
        val cL: CL,
        @SerializedName("CO")
        val cO: CO,
        @SerializedName("CR")
        val cR: CR,
        @SerializedName("CV")
        val cV: CV,
        @SerializedName("CZ")
        val cZ: CZ,
        @SerializedName("DE")
        val dE: DE,
        @SerializedName("DK")
        val dK: DK,
        @SerializedName("DO")
        val dO: DO,
        @SerializedName("EC")
        val eC: EC,
        @SerializedName("EE")
        val eE: EE,
        @SerializedName("EG")
        val eG: EG,
        @SerializedName("ES")
        val eS: ES,
        @SerializedName("FI")
        val fI: FI,
        @SerializedName("FJ")
        val fJ: FJ,
        @SerializedName("FR")
        val fR: FR,
        @SerializedName("GB")
        val gB: GB,
        @SerializedName("GF")
        val gF: GF,
        @SerializedName("GI")
        val gI: GI,
        @SerializedName("GR")
        val gR: GR,
        @SerializedName("GT")
        val gT: GT,
        @SerializedName("HK")
        val hK: HK,
        @SerializedName("HN")
        val hN: HN,
        @SerializedName("HR")
        val hR: HR,
        @SerializedName("HU")
        val hU: HU,
        @SerializedName("ID")
        val iD: ID,
        @SerializedName("IE")
        val iE: IE,
        @SerializedName("IL")
        val iL: IL,
        @SerializedName("IN")
        val iN: IN,
        @SerializedName("IQ")
        val iQ: IQ,
        @SerializedName("IS")
        val iS: IS,
        @SerializedName("IT")
        val iT: IT,
        @SerializedName("JM")
        val jM: JM,
        @SerializedName("JO")
        val jO: JO,
        @SerializedName("JP")
        val jP: JP,
        @SerializedName("KR")
        val kR: KR,
        @SerializedName("KW")
        val kW: KW,
        @SerializedName("LB")
        val lB: LB,
        @SerializedName("LI")
        val lI: LI,
        @SerializedName("LT")
        val lT: LT,
        @SerializedName("LV")
        val lV: LV,
        @SerializedName("MD")
        val mD: MD,
        @SerializedName("MK")
        val mK: MK,
        @SerializedName("MT")
        val mT: MT,
        @SerializedName("MU")
        val mU: MU,
        @SerializedName("MX")
        val mX: MX,
        @SerializedName("MY")
        val mY: MY,
        @SerializedName("MZ")
        val mZ: MZ,
        @SerializedName("NL")
        val nL: NL,
        @SerializedName("NO")
        val nO: NO,
        @SerializedName("NZ")
        val nZ: NZ,
        @SerializedName("OM")
        val oM: OM,
        @SerializedName("PA")
        val pA: PA,
        @SerializedName("PE")
        val pE: PE,
        @SerializedName("PH")
        val pH: PH,
        @SerializedName("PK")
        val pK: PK,
        @SerializedName("PL")
        val pL: PL,
        @SerializedName("PS")
        val pS: PS,
        @SerializedName("PT")
        val pT: PT,
        @SerializedName("PY")
        val pY: PY,
        @SerializedName("QA")
        val qA: QA,
        @SerializedName("RO")
        val rO: RO,
        @SerializedName("RS")
        val rS: RS,
        @SerializedName("RU")
        val rU: RU,
        @SerializedName("SA")
        val sA: SA,
        @SerializedName("SE")
        val sE: SE,
        @SerializedName("SG")
        val sG: SG,
        @SerializedName("SI")
        val sI: SI,
        @SerializedName("SK")
        val sK: SK,
        @SerializedName("SM")
        val sM: SM,
        @SerializedName("SV")
        val sV: SV,
        @SerializedName("TH")
        val tH: TH,
        @SerializedName("TR")
        val tR: TR,
        @SerializedName("TT")
        val tT: TT,
        @SerializedName("TW")
        val tW: TW,
        @SerializedName("UG")
        val uG: UG,
        @SerializedName("US")
        val uS: US,
        @SerializedName("UY")
        val uY: UY,
        @SerializedName("VE")
        val vE: VE,
        @SerializedName("YE")
        val yE: YE,
        @SerializedName("ZA")
        val zA: ZA
    ) {
        data class AE(
            @SerializedName("link")
            val link: String,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class AL(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class AR(
            @SerializedName("link")
            val link: String,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class AT(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("rent")
            val rent: List<Rent>
        ) {
            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class AU(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class BA(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class BB(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class BE(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class BG(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class BH(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class BO(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class BR(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class BS(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class CA(
            @SerializedName("link")
            val link: String,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class CH(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class CL(
            @SerializedName("link")
            val link: String,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class CO(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class CR(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class CV(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>
        ) {
            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class CZ(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class DE(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("rent")
            val rent: List<Rent>
        ) {
            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class DK(
            @SerializedName("link")
            val link: String,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class DO(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class EC(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class EE(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class EG(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>
        ) {
            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class ES(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("ads")
            val ads: List<Ad>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Ad(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class FI(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class FJ(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class FR(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("rent")
            val rent: List<Rent>
        ) {
            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class GB(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class GF(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class GI(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class GR(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class GT(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class HK(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class HN(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class HR(
            @SerializedName("link")
            val link: String,
            @SerializedName("ads")
            val ads: List<Ad>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Ad(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class HU(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class ID(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class IE(
            @SerializedName("link")
            val link: String,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class IL(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class IN(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class IQ(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class IS(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class IT(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class JM(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class JO(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class JP(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class KR(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class KW(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class LB(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class LI(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class LT(
            @SerializedName("link")
            val link: String,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class LV(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class MD(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class MK(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class MT(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("rent")
            val rent: List<Rent>
        ) {
            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class MU(
            @SerializedName("link")
            val link: String,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class MX(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class MY(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class MZ(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>
        ) {
            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class NL(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class NO(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class NZ(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class OM(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class PA(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class PE(
            @SerializedName("link")
            val link: String,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class PH(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class PK(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class PL(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class PS(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class PT(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class PY(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class QA(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class RO(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class RS(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class RU(
            @SerializedName("link")
            val link: String,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class SA(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class SE(
            @SerializedName("link")
            val link: String,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class SG(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class SI(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class SK(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("rent")
            val rent: List<Rent>
        ) {
            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class SM(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class SV(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class TH(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class TR(
            @SerializedName("link")
            val link: String,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class TT(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class TW(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class UG(
            @SerializedName("link")
            val link: String,
            @SerializedName("buy")
            val buy: List<Buy>,
            @SerializedName("rent")
            val rent: List<Rent>
        ) {
            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class US(
            @SerializedName("link")
            val link: String,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class UY(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class VE(
            @SerializedName("link")
            val link: String,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class YE(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }

        data class ZA(
            @SerializedName("link")
            val link: String,
            @SerializedName("flatrate")
            val flatrate: List<Flatrate>,
            @SerializedName("rent")
            val rent: List<Rent>,
            @SerializedName("buy")
            val buy: List<Buy>
        ) {
            data class Flatrate(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Rent(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )

            data class Buy(
                @SerializedName("logo_path")
                val logoPath: String,
                @SerializedName("provider_id")
                val providerId: Int,
                @SerializedName("provider_name")
                val providerName: String,
                @SerializedName("display_priority")
                val displayPriority: Int
            )
        }
    }
}