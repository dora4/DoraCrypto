# When Your Files "Live" on Someone Else’s Server

**Examining the Trust Dilemma of Personal Data Storage Through ByteDance’s 114-Person Compliance Breach Incident**

---

## I. A Thought-Provoking Statistic

On September 22, ByteDance released an internal anti-corruption notice.

The numbers alone are striking: 114 employees were dismissed for rule violations, 8 were referred to judicial authorities, and 6 faced civil lawsuits. But what made me read the notice repeatedly were several key details.

One employee used AI tools to organize business information and generated **more than a hundred documents containing internal confidential information**, then illegally backed them up to a personal Feishu account. Another employee, despite clear team reminders of confidentiality requirements during resignation, still illegally backed up the internal code repository.

Pay attention to the keyword here: **backup**.

These people were not hackers, external attackers, or social engineering experts wielding phishing emails. They were ordinary employees with authorized access to company data. Their "violating" act was essentially copying files into their own storage space.

This reveals a deeper issue: when data is stored on someone else’s servers, you never have full control over **who can access it**.

## II. The Trust Paradox of Cloud Storage

Let us shift perspective from enterprises to individual users.

How much of your data do you keep in the cloud today?

Photos, videos, documents, contracts, scanned ID cards, bank statements, medical records, children’s report cards, email correspondence with lawyers, unfinished novel manuscripts, draft love letters to your loved ones...

These files are scattered across Baidu Netdisk, iCloud, Google Drive, OneDrive, and cloud sync services from various phone manufacturers. They share one common trait: **they are not physically in your possession**.

Your files "reside" on someone else’s servers, protected by their encryption schemes, governed by their access policies, and bound by their employee permission controls. Everything that happens after you hit the "upload" button — which nodes the files are distributed to, whether redundant copies are made, who can decrypt the data, how long logs are retained — is unknown to you and beyond your control.

This is the trust paradox of cloud storage: **The more you rely on it, the more it knows about you; the more it knows about you, the harder it is for you to leave.**

The 2026 list of data breaches reads like a collection of dark humor:

- January: Approximately 1.2 million account records from France’s national bank archive system were leaked
- March: 350GB of European Commission data was stolen by ShinyHunters, including mail server dumps and confidential contracts
- April: 195 million taxpayer records and 220 million citizen registration records of the Mexican government were leaked
- May: Education platform Canvas suffered a breach exposing 275 million user records, covering 3.65TB of data
- Same month: 8TB of technical files at a Foxconn North American plant were encrypted by ransomware
- Same month: Source code from roughly 4,000 internal GitHub repositories was stolen

These are not distant stories. They happened this year, involving some of the world’s most influential institutions and platforms. If even the European Commission cannot secure its data, what makes you trust a free cloud drive to protect your family photos?

## III. "Ordinary Files" and "Private Data" Should Not Share the Same Lock

This was a core design decision made by Dora Cloud from the start.

Most cloud storage services treat all files equally — whether it is a child’s homework or your medical examination report, everything sits in the same space and is managed under one permission system. This makes sense for convenience, yet creates a massive security risk.

Different categories of data face completely different threat models.

A leaked travel photo may only embarrass you. But a file containing your ID number and bank card details can directly lead to identity theft and financial fraud. In a typical case of the crime of infringing upon citizens’ personal information reported by the Ministry of Public Security in 2026, a criminal gang illegally purchased personal information from multiple sources including decoration companies, government data maintenance firms and property management agencies, covering over 6 million records with an involved amount of more than 500,000 yuan.

6 million records. Behind each record may be an "ordinary file" stored by someone on a cloud drive.

Dora Cloud divides storage into two zones:
**General File Zone** — Stores daily files such as photos, videos and documents, supports multi-device synchronization and fast access to meet daily convenience needs.

**Private Data Zone** — Stores highly sensitive content including ID documents, financial data, health records and legal files. It adopts independent encryption channels and stricter access controls. Even if permissions to the General File Zone are compromised, the Private Data Zone remains secure.

This is not a technical gimmick. It reflects the basic principle of **graded protection**: you do not need a nuclear warhead to guard an apple, nor should you secure a vault with a regular door lock.

## IV. Why Is the Minimum Standard of "No Leakage" So Hard to Achieve?

Let us return to ByteDance’s notice.

One detail deserves attention: multiple employees were penalized for "unauthorized querying and external disclosure of internal confidential information". Some illegally retrieved information using system permissions and leaked it to external contacts via social apps. Others voluntarily assisted outsiders to query and leak information for "showing off".

These incidents took place at a top tech company with tens of thousands of employees, a large security budget and well-established internal control systems.

If even ByteDance cannot guarantee "no leakage", what reason does an average user have to trust that their private files on a big tech cloud drive will remain safe?

The answer may be: you have no guaranteed reason. You can only **choose** to trust it, because you have no better alternative.

Dora Cloud aims to offer that better option. Not necessarily because its security technology outperforms large tech firms — frankly, major platforms have overwhelming advantages in infrastructure. Instead, it does something large companies are reluctant to do: **limit access to users’ data**.

End-to-end encryption means Dora Cloud’s servers only store ciphertext. Your private data is encrypted before it leaves your device, remains encrypted during transmission, and stays encrypted on the server. Only your private key can decrypt it. Even Dora Cloud’s own engineers, or a rogue internal employee who obtains files on the server, will only see unintelligible binary data.

This is not about trusting a person or a company. It is about trusting mathematics.

## V. A Simple Criterion for Judgment

In the information-saturated year of 2026, to judge whether a cloud storage service is worthy of your trust, ask yourself one simple question:

**"If all of this company’s servers were seized tomorrow, would I still be able to retrieve my files?"**

If the answer is "no" — your files are not truly "yours", but merely "deposited there".

Dora Cloud supports local key management and export functions. Your data can always be fully exported, independent of whether the platform remains in operation. This is a simple yet critical promise: your files are yours, forever.

The Mid-Autumn Festival is approaching. Many people will take family photos, record videos, and save chat records with distant relatives. The value of these files lies not in how many gigabytes they occupy, but in what they carry.

Find a trustworthy place to store them.

That is what "cloud storage" is truly meant to be.